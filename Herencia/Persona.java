package Herencia;

public class Persona {

	private String Nombre;
	private char Genero;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, char genero) {
		Nombre = nombre;
		Genero = genero;
	}

	public String ToString() {
		return Nombre+"\t"+Genero+"\t";
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public char getGenero() {
		return Genero;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}
	
	
	
}
