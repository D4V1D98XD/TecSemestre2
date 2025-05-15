package empleados;
import java.io.Serializable;
import java.util.Random;
public class Empleado extends Persona implements Serializable{
	private char tipoEmpleado;
	private int numeroDepartamento;
	private int sueldoMensual;
	private String fechaIngreso;
	private int diasAguinaldo;
	private int Aguinaldo;
	
	public Empleado() {
		super();
	}
	
	public Empleado(int edad, String nombre, char genero, char tipoempleado, int numdepartamento, int sueldo, String fecha, int dias, int aguinaldo) {
		super(edad, nombre, genero);
		tipoEmpleado = tipoempleado;
		numeroDepartamento = numdepartamento;
		sueldoMensual = sueldo;
		fechaIngreso = fecha;
		diasAguinaldo = dias;
		Aguinaldo = aguinaldo;
	}
	public char getTipoEmpleado() {
		return tipoEmpleado;
	}
	public void setTipoEmpleado(char tipoEmpleado) {
		this.tipoEmpleado = tipoEmpleado;
	}
	public int getNumeroDepartamento() {
		return numeroDepartamento;
	}
	public void setNumeroDepartamento(int numeroDepartamento) {
		this.numeroDepartamento = numeroDepartamento;
	}
	public int getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(int sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getDiasAguinaldo() {
		return diasAguinaldo;
	}
	public void setDiasAguinaldo(int diasAguinaldo) {
		this.diasAguinaldo = diasAguinaldo;
	}
	public int getAguinaldo() {
		return Aguinaldo;
	}
	public void setAguinaldo(int aguinaldo) {
		Aguinaldo = aguinaldo;
	}

	public static String nombres() {
		String nombre;
		Random random = new Random();
		String[] nombres = {"Leo", "Jesus", "Miriam", "Pepe", "Pepe", "Barbero", "Harry", "Dandi", "Tachu", "Adrian"};
		int nombrepos = random.nextInt(0,10);
		nombre = nombres[nombrepos];
		return nombre;
		
	}
	
	public static int edad() {
		Random random = new Random();
		int edad = random.nextInt(20, 61);
		return edad;
	}
	
	public static char genero() {
		Random random = new Random();
		char tipo;
		char[] tipos = {'M', 'F'};
		int type = random.nextInt(2);
		tipo = tipos[type];
		return tipo;
	}
	
	public static char generarTipo() {
		Random random = new Random();
		char tipo;
		char[] tipos = {'B', 'E'};
		int type = random.nextInt(2);
		tipo = tipos[type];
		return tipo;
	}
	
	public static int generarNumeroDepartamento() {
		Random random = new Random();
		int departamento = random.nextInt(1,6);
		return departamento;
	}
	
	public static int generarSueldo() {
		Random random = new Random();
		int sueldo = random.nextInt(1500,6001);
		return sueldo;
	}
	
	public static String generarFechaIngreso() {
		Random random = new Random();
		String fecha;
		int dia = random.nextInt(1,29), mes = random.nextInt(1,13), year = random.nextInt(2000, 2026);
		fecha = dia + "/" + mes + "/" + year;
		return fecha;
	}
	
	public static int diasAguinaldo() {
		Random random = new Random();
		int aguinaldo = random.nextInt(1, 50);
		return aguinaldo;
	}
	
}
