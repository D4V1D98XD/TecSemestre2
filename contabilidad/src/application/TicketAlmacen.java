package application;

public class TicketAlmacen {

	private String Entrada, Salida, Existencia, Adquisicion, Debe, Haber, Saldo;
	private int Promedio;
	
	public TicketAlmacen() {
		
	}

	public TicketAlmacen(String entrada, String salida, String existencia, String adquisicion, String debe,
			String haber, String saldo, int promedio) {
		super();
		Entrada = entrada;
		Salida = salida;
		Existencia = existencia;
		Adquisicion = adquisicion;
		Debe = debe;
		Haber = haber;
		Saldo = saldo;
		Promedio = promedio;
	}

	public String getEntrada() {
		return Entrada;
	}

	public void setEntrada(String entrada) {
		Entrada = entrada;
	}

	public String getSalida() {
		return Salida;
	}

	public void setSalida(String salida) {
		Salida = salida;
	}

	public String getExistencia() {
		return Existencia;
	}

	public void setExistencia(String existencia) {
		Existencia = existencia;
	}

	public String getAdquisicion() {
		return Adquisicion;
	}

	public void setAdquisicion(String adquisicion) {
		Adquisicion = adquisicion;
	}

	public String getDebe() {
		return Debe;
	}

	public void setDebe(String debe) {
		Debe = debe;
	}

	public String getHaber() {
		return Haber;
	}

	public void setHaber(String haber) {
		Haber = haber;
	}

	public String getSaldo() {
		return Saldo;
	}

	public void setSaldo(String saldo) {
		Saldo = saldo;
	}

	public int getPromedio() {
		return Promedio;
	}

	public void setPromedio(int promedio) {
		Promedio = promedio;
	}
	
	
}
