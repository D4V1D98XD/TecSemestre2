package productos;

public class Frescos extends Productos{

	public Frescos(){
		
	}

	public Frescos(String caducidad, String lote, String pais, String envasado) {
		super(caducidad, lote, pais, envasado);
	}

	public String ToString() {
		return super.ToString();
	}
}
