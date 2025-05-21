package archivos;
import java.io.*;
import java.util.*;
public class LeerEmpleado {
	public static void mostrarFichero(String nombreFichero, Empleado [] empleados, int opcion)  throws IOException{
		Scanner scan = new Scanner(System.in);
		PrintStream flujoS = System.out;
		ObjectInputStream ois = null;
		File Archivo = null;
		
		try{
			Archivo = new File(nombreFichero);

			if (Archivo.exists()){
				
				ois = new ObjectInputStream(new FileInputStream(Archivo));
				Empleado empleado;
				String nombre, fecha;
				char sexo;
				int edad, sueldo, tipo, departamento, aguinaldo;
				
				for(int i=0; i<20; i++){
					
					empleado = (Empleado)ois.readObject();
					empleados[i]=empleado;
					
					String TIPO=null;
					nombre = empleado.getNombre();
					edad = empleado.getEdad();
					sexo = empleado.getGenero();
					sueldo = empleado.getSueldoMensual();
					departamento = empleado.getNumeroDepartamento();
					tipo = empleado.getTipoEmpleado();
					fecha = empleado.getFechaIngreso();
					aguinaldo = empleado.getDiasAguinaldo();
					
					
					if(tipo == 'B') {
						TIPO="Base"; 
					}
					if(tipo == 'E') {
						TIPO = "Eventual"; 
					}
					if(opcion == 1) {
						//no supe hacer que se imprima derecho, el tamaño de la palabra eventual hace que se desordene
						System.out.println(nombre+"\t"+"\t"+edad+"\t"+sexo+"\t"+sueldo+"\t"+TIPO+"\t"+"\t"+departamento+"\t"+"\t"+aguinaldo+"\t"+"\t"+fecha);
					}
				}
				switch (opcion) {
				case 2:
					empleadosAntiguos(empleados);
				break;
				
				case 3:
					aguinaldoPagar(empleados, scan);
				break;
				
				case 4:
					aguinaldoCategoria(empleados);
				break;
			
			}
			}
			else
				flujoS.println("El fichero no existe");
		}
		
		catch(EOFException e){
			flujoS.println("Fin del Archivo");
			
		}
		catch(ClassNotFoundException e){
			flujoS.println("Error: " + e.getMessage());
		}
		finally{

			if (ois != null) ois.close();
		}
	}

	public static void ImprimeTcDoc(Empleado [] VP,int C){
		System.out.println();
		System.out.println("LISTADO DE PERSONAL");
		for(int z=0;z<C;z++){
			VP[z].quienSoy();
		}
	}
	
	public static void aguinaldoPagar(Empleado[] empleado,Scanner scan) {
		int departamento = 0, aguinaldo = 0;
		String nombre = " ";
		System.out.print("De que departamento desea consultar (1,5): ");
		int opc = scan.nextInt();
		System.out.println("Nombre"+"\t"+"\t"+"Aguinaldo"+"\t"+"Departamento");
		for(int i=0; i<20; i++) {
			if(empleado[i].getNumeroDepartamento() == opc) {
				aguinaldo = empleado[i].getAguinaldo();
				nombre = empleado[i].getNombre(); departamento = empleado[i].getNumeroDepartamento();
				System.out.println(nombre+"\t"+"\t"+aguinaldo+"\t"+"\t"+departamento);
			}
		}
	}
	
	public static void empleadosAntiguos(Empleado[] empleado) {
		String fecha, nombre;
		for(int i=0; i<20; i++) {
			fecha = empleado[i].getFechaIngreso(); nombre = empleado[i].getNombre();
			String[] diamesanio = fecha.split("/");
			int year = Integer.parseInt(diamesanio[2]);
			
			if(year <=2015) {
				System.out.println(nombre+"\t"+"\t"+fecha+"\t"+"\t"+(2025 - year));
			}
		}
	}
	
	public static void aguinaldoCategoria(Empleado[] empleado) {
		int aguinaldo, aguinaldoBaseF = 0, aguinaldoEventualF = 0;
		int aguinaldoBaseM = 0, aguinaldoEventualM = 0;
		char genero, tipo;
		for(int i=0; i<empleado.length; i++) {
			tipo = empleado[i].getTipoEmpleado();
			genero = empleado[i].getGenero();
			aguinaldo = empleado[i].getAguinaldo();
			
			if(tipo == 'B') {
				if(genero == 'F') {
					aguinaldoBaseF += aguinaldo;
				}
			}
			if(tipo == 'E') {
				if(genero == 'F') {
					aguinaldoEventualF += aguinaldo;
				}
			}
			if(tipo == 'B') {
				if(genero == 'M') {
					aguinaldoBaseM += aguinaldo;
				}
			}
			if(tipo == 'E') {
				if(genero == 'M') {
					aguinaldoEventualM += aguinaldo;
				}
			}
		}
		System.out.println("De Base Femenino      $ "+ aguinaldoBaseF);
		System.out.println("De Eventual Femenino  $ "+ aguinaldoEventualF);
		System.out.println("De Base Masculino     $ "+ aguinaldoBaseM);
		System.out.println("De Eventual Masculino $ "+ aguinaldoEventualM);
	}
}
