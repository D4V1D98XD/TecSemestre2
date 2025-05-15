package empleados;
import java.io.Serializable;
public abstract class Persona implements Serializable{

	private int Edad;
	private String Nombre;
	private char Genero;
	
	public Persona(){
		
	}

	public Persona(int edad, String nombre, char genero) {
		Edad = edad;
		Nombre = nombre;
		Genero = genero;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
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
	public void quienSoy() {
		System.out.println("Soy "+ Nombre + " Tengo "+ Edad + "Años");
	}
}
