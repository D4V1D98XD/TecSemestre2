package archivos;
import java.io.*; // File y IOException
import java.util.Scanner;
public class crearArchivo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nombreArchivo = null; // nombre del archivo
		File Archivo = null; // es un objeto que identifica el archivo
		String nombreCarpeta = null;
		
		System.out.println("      BIENVENIDO AL GENERADOR DE ARCHIVOS");
		System.out.println("===================================================");
		System.out.println();
		int opcion = 0;
		do {
			opcion = menu(scan);	
			
			switch(opcion) {
				case 1: 
					System.out.println("Nombre de la carpeta por crear: ");
					nombreCarpeta = scan.next();
					int opc = crearDirectorio(nombreCarpeta, scan);
					if(opc == 1) {
						opcion = opc;
					}
				break;
				
				case 2:
					try {
						
						System.out.println("Nombre del archivo por crear: ");
						nombreArchivo = scan.next();
						if(nombreCarpeta != null) {
							Archivo = new File(nombreCarpeta, nombreArchivo);
						}else {
							Archivo = new File(nombreArchivo); //crea un objeto que identifica el archivo	
						}
						String respuesta = "s"; // cambiado a String para que sea mas manipulable
						
						if(Archivo.exists()) {
							System.out.println("El Archivo ya existe, desea sobreescribirlo? (s/n)");
							respuesta = scan.next();
						}
						if(respuesta.equalsIgnoreCase("s")) {
							crearArchivo(Archivo, scan);
						}
						
					}catch(IOException e) { //error en la creacion del archivo
						System.out.println("Error: " + e.getMessage());
					}
				break;
				
				case 3:
					
				break;
				
				case 4:
					
				break;
				
				case 5:
					System.out.println("Saliendo del programa...");
				break;
				
				default:
					System.out.println("Opcion equivocada");
				break;
			}
		}while(opcion != 5);
		scan.close();
	}
	
	public static int menu(Scanner scan) {
		int opcion = 0;
		System.out.println("Que es lo que desea hacer?");
		System.out.println();
		System.out.println("1.- Seleccionar una carpeta");
		System.out.println("2.- Crear un archivo");
		System.out.println("3.- Leer un archivo");
		System.out.println("4.- Borrar un archivo");
		System.out.println("5.- Salir");
		opcion = scan.nextInt();
		return opcion;
	}
	
	public static void crearArchivo(File Archivo, Scanner scan) throws IOException  { //lanza el error
	
		ObjectOutputStream oos = null;
		String respuesta = "s";
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(Archivo));
			//es una clase de java que se encarga de convertir los datos en bytes
			String nombre, genero, fechaIngreso;
			int edad, sueldo, departamento, aguinaldo;
			char tipo;
			
			do{
		    	System.out.print("Nombre: "); nombre = scan.next();
		    	System.out.print("Edad: "); edad = scan.nextInt();
		    	System.out.print("Genero(M/F): "); genero = scan.next();
		    	System.out.print("Sueldo: "); sueldo= scan.nextInt(); //Mensual
		    	System.out.print("Dias de Aguinaldo: "); aguinaldo= scan.nextInt();
		    	System.out.print("Fecha de Ingreso: "); fechaIngreso = scan.next();
		    	
		    	do{
		        	System.out.print("Tipo de Empleado  (B= de Base, E= Eventual): "); //(B= de Base, E= Eventual) 
		        	tipo= scan.next().charAt(0);
		        }while(tipo == 'E' || tipo == 'B'); 
		        
		    	do{
		        	System.out.print("Numero de Departamento: (1-5): ");
		        	departamento= scan.nextInt();
		        }while(departamento<1 || departamento>5);
		        
		        oos.writeObject(new Profesor(nombre, edad, genero, sueldo, tipo, departamento, fechaIngreso, aguinaldo)); //crea el objeto profesor		        System.out.println("     ARCHIVO GENEADO CON EXITO!");
		        System.out.println("=======================================");
		        System.out.println("Desea crear otro archivo? (s/n): ");
		        respuesta = scan.next();
		        
		      }while (respuesta.equalsIgnoreCase("s"));
		}finally {
			if (oos != null) oos.close();
		}
	}
	
	public static int crearDirectorio(String nombre, Scanner scan) {
		String resp = null;
		int opcion = 0;
		File directorio = new File(nombre);
		if(directorio.exists()) {
			System.out.println("Esta carpeta ya existe, desea utilizarla? (s/n): ");	
			resp = scan.next();
			if(resp.equalsIgnoreCase("n")) {
				opcion = 1;
				return opcion;
			}
		}
		if(directorio.mkdir()) {
			System.out.println("La carpeta fue creada con exito: "+ directorio.getAbsolutePath());
		}
		return opcion;
	}
}
