package polimorfismo1;

import java.util.Random;

public class Profesor extends Persona{

	private String Materia;
	private boolean Asistencia;
	
	public Profesor() {
		
	}
	
	public Profesor(String nombre, int edad, char genero, String materia, boolean asistencia) {
		super(nombre, edad, genero);
		Materia = materia;
		Asistencia = asistencia;
	}

	public String ToString() {
		String asis = " ";
		if(Asistencia == true) {
			asis = "Asistio";
		}else {
			asis = "no asistio";
		}
		return super.ToString() +"\t" + Materia+"\t" +asis;
	}
	
	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}
	public boolean isAsistencia() {
		return Asistencia;
	}

	public void setAsistencia(boolean asistencia) {
		Asistencia = asistencia;
	}

	public boolean Asistencia() {
		Random random = new Random();
		boolean asistencia;
		int asis = 0;
		asis = random.nextInt(5);
		if(asis == 0) {
			asistencia = false;
		}else {
			asistencia = true;
		}
		return asistencia;
	}

}