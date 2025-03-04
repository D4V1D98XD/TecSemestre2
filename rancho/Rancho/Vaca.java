package Rancho;

public class Vaca extends Rancho{
	
	private int Tipo = 0;
	private int Variante = 0;
	private int Litros = 0;
	
	public Vaca() {
		
	}

	public Vaca(String nombre, int tipo, int variante, int litros) {
		super(nombre);
		Tipo = tipo;
		Variante = variante;
		Litros = litros;
	}
	
	public String ToString() {
		return  Tipo +"\t" +  Variante +"\t" + Litros;
	}
	
	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	public int getVariante() {
		return Variante;
	}

	public void setVariante(int variante) {
		Variante = variante;
	}

	public int getLitros() {
		return Litros;
	}

	public void setLitros(int litros) {
		Litros = litros;
	}
	
	
}
