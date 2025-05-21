package archivos;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Empresa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcion, opcion2;
		
		//para el caso 2
		PrintStream flujoS = System.out; 
		String nombreFichero = null;     
		File fichero = null;  	
		
		do {
			menu();
			System.out.print("Elige una opción: ");
			while (!scan.hasNextInt()) { // si se pone una letra te dice que pongas un numero
				System.out.print("Entrada inválida. Intenta de nuevo: ");
				scan.next();
			}
			opcion = scan.nextInt();

			switch (opcion) {
			//CASO 1
			//-----------------------------------------------------------------------------------------------
			case 1:
				String nombreArchivo = null;
			    File Archivo = null;
			    try{
			      System.out.print("Nombre del ARCHIVO de datos a escribir: ");
			      nombreArchivo = scan.next();
			      Archivo = new File(nombreArchivo);
			      
			      char resp = 's';
			      
			      if (Archivo.exists()){
			        System.out.print("El ARCHIVO ya existe, desea sobreescribirlo? (s/n) ");
			        resp = scan.next().charAt(0);
			      } 
			      
			      if (resp == 's'){
			        GrabarEmpleado.CreaArchivo(Archivo);
			        System.out.println("Archivo Creado!");
			      }
			    }
			    
			    catch(IOException e){
			      System.out.println("Error: " + e.getMessage());
			    }
			break;
			//CASO 2
			//-----------------------------------------------------------------------------------------
			case 2:
				do {
					menu2();
					System.out.print("Elige una opción: ");
					while (!scan.hasNextInt()) { // si se pone una letra te dice que pongas un numero
						System.out.print("Entrada inválida. Intenta de nuevo: ");
						scan.next();
					}
					opcion2 = scan.nextInt();
					switch (opcion2) {
					case 1:
						try{
							flujoS.print("Nombre del fichero de datos a leer: ");
							nombreFichero = scan.next();
							Empleado [] VP=new Empleado[20];
							System.out.println("Nombre"+"\t"+"\t"+"edad"+"\t"+"sexo"+"\t"+"sueldo"+"\t"+"tipo"+"\t"+"\t"+"departamento"+"\t"+"\t"+"Dias aguinaldo"+"\t"+"\t"+"Fecha de Ingreso");
							LeerEmpleado.mostrarFichero(nombreFichero, VP, opcion2);
						}
						catch(IOException e){
							System.out.println("Error: " + e.getMessage());
						}
					break;
					
					case 2:
						try{
							flujoS.print("Nombre del fichero de datos a leer: ");
							nombreFichero = scan.next();
							Empleado [] VP=new Empleado[20];
							System.out.println("Nombre"+"\t"+"\t"+"Fecha de ingreso"+"\t"+"Años trabajados");
							LeerEmpleado.mostrarFichero(nombreFichero, VP, opcion2);
						}
						catch(IOException e){
							System.out.println("Error: " + e.getMessage());
						}
					break;
					
					case 3:
						try{
							flujoS.print("Nombre del fichero de datos a leer: ");
							nombreFichero = scan.next();
							Empleado [] VP=new Empleado[20];
							
							LeerEmpleado.mostrarFichero(nombreFichero, VP, opcion2);
						}
						catch(IOException e){
							System.out.println("Error: " + e.getMessage());
						}
					break;
					
					case 4:
						try{
							flujoS.print("Nombre del fichero de datos a leer: ");
							nombreFichero = scan.next();
							Empleado [] VP=new Empleado[20];
							System.out.println("Nombre"+"\t"+"\t"+"Aguinaldo"+"\t"+"Departamento");
							LeerEmpleado.mostrarFichero(nombreFichero, VP, opcion2);
						}
						catch(IOException e){
							System.out.println("Error: " + e.getMessage());
						}
					break;
					
					case 5:
						System.out.println("Saliendo...");
					break;
					
					default:
						System.out.println("Opción invalida.");
					break;
					
					}
				}while(opcion2 != 5);
				
			break;
			
			case 3:
				System.out.println("Saliendo...");
			break;
		
			default:
				System.out.println("Opción invalida.");
			break;
			}

		} while (opcion != 3);
		scan.close();
	}

	public static void menu() {
		System.out.println("\n--- Menu de Empleados ---");
		System.out.println("1. Grabar empleados");
		System.out.println("2. Leer empleados");
		System.out.println("3. Salir");
	}
	
	public static void menu2() {
		System.out.println("\n--- Menu de Leer ---");
		System.out.println("1. Mostrar Fichero");
		System.out.println("2. Empleados Antiguos");
		System.out.println("3. Aguinaldo a Pagar");
		System.out.println("4. Aguinaldo por Categoria");
		System.out.println("5. Salir");
		
	}
}