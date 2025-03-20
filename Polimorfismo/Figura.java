package Polimorfismo;
public abstract class Figura {
	private String Nombre;
	private char Relleno;
	
	public Figura() {
		
	}

	public Figura(String nombre, char relleno) {
		Nombre = nombre;
		Relleno = relleno;
	}
	
	public String ToString() {
		return Nombre + Relleno;
	}

	public abstract int calcularArea();
	public abstract int calcularPerimetro();
	public abstract void Dibujar();
	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public char getRelleno() {
		return Relleno;
	}

	public void setRelleno(char relleno) {
		Relleno = relleno;
	}
	
}
