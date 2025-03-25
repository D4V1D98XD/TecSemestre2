package polimorfismo;

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

	public void Asistencia() {
			
	}

}
