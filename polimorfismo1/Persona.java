package polimorfismo;

public abstract class Persona {

	private String Nombre;
	private int Edad;
	private char Genero;
	
	public Persona() {}

	public Persona(String nombre, int edad, char genero) {
		Nombre = nombre;
		Edad = edad;
		Genero = genero;
	}

	public abstract void Asistencia();
	
	public String ToString() {
		return Nombre + Edad + Genero;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}
	
	
	
}
