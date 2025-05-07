package archivos;
import java.io.*;
public class Profesor extends Persona implements Serializable{

	private int Sueldo; // mensual
	private int Tipo;// (B= de Base, E= Eventual)
	private int Departamento; // (1-5) 
	private String FechaIngreso;
	private int Aguinaldo;
	
	public Profesor() {
		super();
	}
	
	
	public Profesor(String name, int age, String sex, int sueldo, int tipo, int departamento, String fechaIngreso, int aguinaldo) {
		super(age, name, sex);
		Sueldo = sueldo;
		Tipo = tipo;
		Departamento = departamento;
		FechaIngreso = fechaIngreso;
		Aguinaldo = aguinaldo;
		
	}
	public int getSueldo() {
		return Sueldo;
	}
	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public int getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(int departamento) {
		Departamento = departamento;
	}
	public String getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}
	public int getAguinaldo() {
		return Aguinaldo;
	}
	public void setAguinaldo(int aguinaldo) {
		Aguinaldo = aguinaldo;
	}	
	
	
	
}
