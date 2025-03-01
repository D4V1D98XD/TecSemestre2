package productos;

public class Productos {

	private String caducidad;
	private String lote;
	private String pais;
	private String Envasado;
	
	public Productos() {
		
	}

	public Productos(String lote, String envasado, String pais, String caducidad) {
		
		this.caducidad = caducidad;
		this.lote = lote;
		this.pais = pais;
		Envasado = envasado;
	}

	public String getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEnvasado() {
		return Envasado;
	}

	public void setEnvasado(String envasado) {
		Envasado = envasado;
	}

	public String ToString() {
		return lote + "\t" + Envasado + "\t" + pais + "\t" + caducidad;
	}
	
	
}
