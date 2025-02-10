package Agenda;

public class agenda {

	private String numeroTelefono;
	private String nombre;
	
	public agenda() {
		
	}
	
	public agenda(String numeroTelefono, String nombre) {
		super();
		this.numeroTelefono = numeroTelefono;
		this.nombre = nombre;
	}
	
	public String ToString() {
		return nombre+"\t" + numeroTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
