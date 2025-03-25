package polimorfismo1;

public class Aula{

	private int numAula;
	private int numAlumno;
	private String Materia;
	
	public Aula() {
		
	}

	public Aula(int numAula, int numAlumno, String materia) {
		this.numAula = numAula;
		this.numAlumno = numAlumno;
		Materia = materia;
	}

	public String ToString() {
		return numAula + numAlumno + Materia;
	}
	
	public int getNumAula() {
		return numAula;
	}

	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}

	public int getNumAlumno() {
		return numAlumno;
	}

	public void setNumAlumno(int numAlumno) {
		this.numAlumno = numAlumno;
	}

	public String getMateria() {
		return Materia;
	}

	public void setMateria(String materia) {
		Materia = materia;
	}
	
	
}
