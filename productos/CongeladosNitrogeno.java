package productos;

public class CongeladosNitrogeno extends Congelados{
	String Metodo;
	String Tiempo;
	
	public CongeladosNitrogeno() {
		
	}

	public CongeladosNitrogeno(String caducidad, String lote, String pais, String envasado, String temp, String metodo, String tiempo) {
		super(caducidad, lote, pais, envasado, temp);
		Metodo = metodo;
		Tiempo = tiempo;
	}
	public String ToString() {
		return super.ToString() + "/t" + Metodo + "/t" + Tiempo;
	}

	public String getMetodo() {
		return Metodo;
	}

	public void setMetodo(String metodo) {
		Metodo = metodo;
	}

	public String getTiempo() {
		return Tiempo;
	}

	public void setTiempo(String tiempo) {
		Tiempo = tiempo;
	}
	
	
}
