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
		return super.ToString() + Materia;
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

	public void Asistencia(Estudiante[] e, Profesor[] p) {
		Random random = new Random();
		boolean asistencia;
		int asis = 0;
		for(int i=0; i<e.length; i++) {
			asis = random.nextInt(5);
			if(asis == 0) {
				asistencia = false;
			}else {
				asistencia = true;
			}
			p[i].setAsistencia(asistencia);
		}
	}

}
