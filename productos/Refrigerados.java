package productos;

public class Refrigerados extends Productos{

	String temperatura;
	String Codigo;
	
	public Refrigerados() {
		
	}

	public Refrigerados(String caducidad, String lote, String pais, String envasado, String temp, String codigo) {
		super(caducidad, lote, pais, envasado);
		temperatura = temp;
		Codigo = codigo;
	}

	public String ToString() {
		return super.ToString() + "/t" + temperatura + "/t" + Codigo;
	}
	
	public String getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	
	
}
