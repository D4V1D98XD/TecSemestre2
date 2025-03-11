package Herencia;

public class Alumno extends Persona{

	String NumControl;
	char Carrera;
	int Cal1, Cal2, Cal3, Cal4;
	double Promedio;
	
	public Alumno() {
		
	}
	
	public Alumno(String nombre, char genero, String numControl, char carrera, int cal1, int cal2, int cal3, int cal4) {		
		super(nombre, genero);
		NumControl = numControl;
		Carrera = carrera;
		Cal1 = cal1;
		Cal2 = cal2;
		Cal3 = cal3;
		Cal4 = cal4;
		Promedio = 0;
	}

	public String ToString() {
		return super.ToString() + NumControl +"\t" + Carrera +"\t" + Cal1 +"\t" + Cal2 +"\t" + Cal3 +"\t" + Cal4 +"\t" + Promedio;
	}
	
	public String getNumControl() {
		return NumControl;
	}

	public void setNumControl(String numControl) {
		NumControl = numControl;
	}

	public char getCarrera() {
		return Carrera;
	}

	public void setCarrera(char carrera) {
		Carrera = carrera;
	}

	public int getCal1() {
		return Cal1;
	}

	public void setCal1(int cal1) {
		Cal1 = cal1;
	}

	public int getCal2() {
		return Cal2;
	}

	public void setCal2(int cal2) {
		Cal2 = cal2;
	}

	public int getCal3() {
		return Cal3;
	}

	public void setCal3(int cal3) {
		Cal3 = cal3;
	}

	public int getCal4() {
		return Cal4;
	}

	public void setCal4(int cal4) {
		Cal4 = cal4;
	}

	public void setPromedio(double promedio) {
		Promedio = promedio;
	}
	
	

}
