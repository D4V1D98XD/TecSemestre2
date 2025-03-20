package Polimorfismo;

public class Cuadrado extends Figura{

	private int Lado;

	public Cuadrado() {
		
	}
	
	
	
	public Cuadrado(String nombre, char relleno, int lado) {
		super(nombre, relleno);
		Lado = lado;
	}

	public String ToString() {
		return super.ToString() + Lado;
	}
	
	public int getLado() {
		return Lado;
	}

	public void setLado(int lado) {
		Lado = lado;
	}
	//METODOS ABSTRACTOS
	public int calcularArea() {
		int area = Lado * Lado;
		return area;
	}

	public int calcularPerimetro() {
		return Lado * 4;
	}

	public void Dibujar() {
		char relleno = super.getRelleno();
		for(int i=0; i<= Lado; i++) {
			for(int j=0; j<=Lado; j++) {
				System.out.println(relleno+"");
			}
			System.out.println();
		}
	}
}
