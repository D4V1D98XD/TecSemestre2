package empleados;
import java.io.*;
import java.util.*;
public class GrabarEmpleado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	 	String nombreArchivo = null;     // nombre del fichero
	    File Archivo = null; // objeto que identifica el fichero
	    try
	    {
	      // Crear un objeto File que identifique al fichero
	      System.out.print("Nombre del ARCHIVO de datos a escribir: ");
	      nombreArchivo = scan.next();
	      Archivo = new File(nombreArchivo);
	      // Verificar si el fichero existe
	      char resp = 's';
	      if (Archivo.exists())
	      {
	        System.out.print("El ARCHIVO ya existe, desea sobreescribirlo? (s/n) ");
	        resp = scan.next().charAt(0);
	      } 
	      if (resp == 's')
	      {
	        CreaArchivo(Archivo, scan);
	      }
	    }
	    catch(IOException e)
	    {
	      System.out.println("Error: " + e.getMessage());
	    }
	}
	public static void CreaArchivo(File Archivo, Scanner scan) throws IOException
	{
		 ObjectOutputStream oos = null;// salida de datos hacia el ARCHIVO
		    char resp;
		    try
		    {
		      // Crear un flujo hacia el ARCHIVO que permita escribir
		      // objetos y datos de tipos primitivos.
		      oos = new ObjectOutputStream(new FileOutputStream(Archivo));
		      // Declarar los datos a escribir en el ARCHIVO
		      String nombre, fecha;
		      int edad, sueldo, departamento, aguinaldo;
		      char tipo, genero;
		      // Leer datos de la entrada estándar y escribirlos
		      // en el ARCHIVO
		      do
		      {
		    	nombre=Empleado.nombres();
		    	edad= Empleado.edad();
		    	genero= Empleado.genero();
		    	fecha = Empleado.generarFechaIngreso();
		    	aguinaldo = Empleado.diasAguinaldo();
		    	sueldo= Empleado.generarSueldo();
		       	tipo= Empleado.generarTipo();
		       	departamento= Empleado.generarNumeroDepartamento();
		     // Crear un objeto Profesor y almacenarlo en el ARCHIVO
		        oos.writeObject(new Empleado(edad, nombre, genero, tipo, departamento, sueldo, fecha, aguinaldo));
		        System.out.print("Desea escribir otro registro? (s/n) ");
		        resp = scan.next().charAt(0);
		      }while (resp == 's' || resp=='S');
		    }
		    finally
		    {
		      // Cerrar el flujo
		      if (oos != null) oos.close();
		    }
	}

}
