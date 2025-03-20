package Polimorfismo;

public class Triangulo extends Figura{

	private int Base, Altura;
	
	
	public Triangulo() {}
	
	
	
	public Triangulo(String nombre, char relleno, int base, int altura) {
		super(nombre, relleno);
		Base = base;
		Altura = altura;
	}

	public String ToString() {
		return super.ToString() + Base + Altura;
	}

	public int getBase() {
		return Base;
	}

	public void setBase(int base) {
		Base = base;
	}

	public int getAltura() {
		return Altura;
	}

	public void setAltura(int altura) {
		Altura = altura;
	}



	@Override
	public int calcularArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void Dibujar() {

	}

}
