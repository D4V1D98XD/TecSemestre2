package Persona;

public class Persona {
	
	private String nombre;
	private int edad;
	private char genero;
	
	public Persona(){
		
	}
	public Persona(String nombre, int edad, char genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String ToString() {
		String g = "FEMENINO";
		if(genero == 'M') {
			g = "MASCULINO";
		}
		
		return nombre + "\t" + edad + "\t";
	}

	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public char isGenero() {
		return genero;
	}
	
}
