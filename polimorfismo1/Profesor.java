package polimorfismo1;

import java.util.Random;

public class Profesor extends Persona{

	private String Materia;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, int edad, char genero, String materia) {
		super(nombre, edad, genero);
		Materia = materia;
	}

	public String ToString() {
		return super.ToString() + Materia;
	}
	
	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}

	public boolean Asistencia(Profesor[] p) {
		Random random = new Random();
		boolean asistencia;
		int asis = random.nextInt(5);
		if(asis == 0) {
			asistencia = false;
		}else {
			asistencia = true;
		}
		return asistencia;
	}

}
