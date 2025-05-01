package archivos;
import java.io.*;
public class Profesor extends Persona implements Serializable{

	private int Sueldo;
	private int Tipo;// ( 1=Completo, 2=Medio, 3=Parcial )
	private int Especialidad; // (1=licenciatura, 2=maestria ó 3=doctorado)
	public Profesor() 
	{
		super();
	}
	public Profesor(String name, int age, String sex, int sueldo, int tipo, int especialidad) {
		super(age, name, sex);
		Sueldo = sueldo;
		Tipo = tipo;
		Especialidad = especialidad;
		
	}
	public int getSueldo() {
		return Sueldo;
	}
	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public int getEspecialidad() {
		return Especialidad;
	}
	public void setEspecialidad(int especialidad) {
		Especialidad = especialidad;
	}	
	
	
	
}
