package productos;

public class Frescos extends Productos{

	public Frescos(){
		
	}

	public Frescos(String lote, String envasado, String pais, String caducidad) {
		super(caducidad, lote, pais, envasado);
	}

	public String ToString() {
		return super.ToString();
	}
}
