package productos;

public class CongeladosAire extends Congelados{
	int Nitrogeno;
	int Oxigeno;
	int Carbono;
	int Vapor;
	
	public CongeladosAire() {
		
	}

	public CongeladosAire(String lote, String envasado, String pais, String caducidad, String temp, int nitrogeno, int oxigeno, int carbono, int vapor) {
		super(caducidad, lote, pais, envasado, temp);
		Nitrogeno = nitrogeno;
		Oxigeno = oxigeno;
		Carbono = carbono;
		Vapor = vapor;
	}
	public String ToString() {
		return super.ToString() + "\t" + Nitrogeno + "\t" + Oxigeno + "\t" + Carbono + "\t" + Vapor;
	}
	public int getNitrogeno() {
		return Nitrogeno;
	}

	public void setNitrogeno(int nitrogeno) {
		Nitrogeno = nitrogeno;
	}

	public int getOxigeno() {
		return Oxigeno;
	}

	public void setOxigeno(int oxigeno) {
		Oxigeno = oxigeno;
	}

	public int getCarbono() {
		return Carbono;
	}

	public void setCarbono(int carbono) {
		Carbono = carbono;
	}

	public int getVapor() {
		return Vapor;
	}

	public void setVapor(int vapor) {
		Vapor = vapor;
	}
	
	
}
