package application;

public class DatosExamen {

	public static int[] calcularExistencias(int[] entradas, int salida) {
	    int[] existencias = new int[entradas.length];
	    int existenciaAcumulada = 0;

	    for (int i = 0; i < entradas.length; i++) {
	        existenciaAcumulada += entradas[i];

	        // Solo restamos la salida en la posición deseada
	        if (i == entradas.length - 1) { // por ejemplo, la salida está al final
	            existenciaAcumulada -= salida;
	        }

	        existencias[i] = existenciaAcumulada;
	    }

	    return existencias;
	}

	
	public static int calcularDebe() {
		int debe = 0;
		
		return debe;
	}
	
	public static int calcularHaber() {
		int debe = 0;
		
		return debe;
	}
	
	public static int calcularSaldo() {
		int saldo = 0;
		
		return saldo;
	}
}