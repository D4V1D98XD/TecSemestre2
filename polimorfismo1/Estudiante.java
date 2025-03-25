package polimorfismo;

public class Estudiante extends Persona{

	private int Calificacion;
	
	public Estudiante() {
		
	}
	
	public Estudiante(String nombre, int edad, char genero, int calificacion) {
		super(nombre, edad, genero);
		Calificacion = calificacion;
	}

	public String ToString() {
		return super.ToString() + Calificacion;
	}

	public int getCalificacion() {
		return Calificacion;
	}

	public void setCalificacion(int calificacion) {
		Calificacion = calificacion;
	}

	public void Asistencia() {
		
	}

}
