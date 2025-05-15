package empleados;
import java.io.*;
public class GrabarEmpleado {
	
	public static void CreaArchivo(File Archivo) throws IOException {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		char resp;

		Empleado[] empleado = new Empleado[20];
		for(int i=0; i<20; i++) {
			empleado[i] = new Empleado();
		}
		
		try{

			fos = new FileOutputStream(Archivo); //overwrites always // if I put it in Spanish it marks something irritating
			oos = new ObjectOutputStream(fos);

			String nombre, fecha;
			int edad, sueldo, departamento, diasAguinaldo = 0, aguinaldo;
			char tipo, genero;

			for (int i = 0; i < 20; i++) {
				
	            nombre = Empleado.nombres();
	            edad = Empleado.edad();
	            genero = Empleado.genero();
	            fecha = Empleado.generarFechaIngreso();
	            diasAguinaldo = Empleado.diasAguinaldo();
	            sueldo = Empleado.generarSueldo();
	            tipo = Empleado.generarTipo();
	            departamento = Empleado.generarNumeroDepartamento();
	            aguinaldo =diasAguinaldo * (sueldo/30);
	            empleado[i] = new Empleado(edad, nombre, genero, tipo, departamento, sueldo, fecha, diasAguinaldo, aguinaldo);
	            oos.writeObject(empleado[i]);
	        }
		}
		finally{
			if (oos != null) oos.close();
			if (fos != null) fos.close();
		}
	}

}
