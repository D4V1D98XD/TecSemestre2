package Empleados;

public class Empleados {

	private String nombre;
	private char genero;
	private int horasTrabajadas;
	private int sueldoHora;
	private int pagoTotal;
	
	public  Empleados() {
		
	}

	public Empleados(String nombre, char genero, int horasTrabajadas, int sueldoHora, int pagoTotal) {
		super();
		this.nombre = nombre;
		this.genero = genero;
		this.horasTrabajadas = horasTrabajadas;
		this.sueldoHora = sueldoHora;
		this.pagoTotal = pagoTotal;
	}
	
	public String toString() {
		return nombre + ":" + "\t" + pagoTotal + "\t" + genero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public void setSueldoHora(int sueldoHora) {
		this.sueldoHora = sueldoHora;
	}

	public void setPagoTotal(int pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public char getGenero() {
		return genero;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public int getSueldoHora() {
		return sueldoHora;
	}

	public int getPagoTotal() {
		return pagoTotal;
	}
	
	
	
	
}
