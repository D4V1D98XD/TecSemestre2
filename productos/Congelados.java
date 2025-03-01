package productos;

public class Congelados extends Productos{

	String temperatura;
	
	public Congelados() {
		
	}

	public Congelados(String lote, String envasado, String pais, String caducidad, String temp) {
		super(caducidad, lote, pais, envasado);
		temperatura = temp;
	}

	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}
	
	public String ToString() {
		return super.ToString() + "\t" + temperatura;
	}
	
	
}
