package productos;

public class CongeladosAgua extends Congelados{

	String Salinidad;
	
	public CongeladosAgua() {
		
	}

	public CongeladosAgua(String lote, String envasado, String pais, String caducidad, String temp, String salinidad) {
		super(caducidad, lote, pais, envasado, temp);
		Salinidad = salinidad;
	}

	public String ToString() {
		return super.ToString() + "\t" + Salinidad;
	}
	
	public String getSalinidad() {
		return Salinidad;
	}

	public void setSalinidad(String salinidad) {
		Salinidad = salinidad;
	}
	
	
}
