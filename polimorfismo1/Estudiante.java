package polimorfismo1;
import java.util.*;
public class Estudiante extends Persona{

	private int Calificacion;
	private boolean Asistencia;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, int edad, char genero, int calificacion, boolean asistencia) {
		super(nombre, edad, genero);
		Calificacion = calificacion;
		Asistencia = asistencia;
	}

	public String ToString() {
		return super.ToString() +"\t" + Calificacion;
	}

	public int getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(int calificacion) {
		Calificacion = calificacion;
	}
	
	public boolean isAsistencia() {
		return Asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		Asistencia = asistencia;
	}

	public boolean Asistencia() {
		Random random = new Random();
		boolean Asistencia = random.nextBoolean();
		
		return Asistencia;
	}


}
