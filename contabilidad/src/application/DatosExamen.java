package application;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javafx.collections.ObservableList;

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

	public static double calcularPEPS(ObservableList<TicketAlmacen> lista, int cantidadSalida) {
        Queue<Double[]> inventario = new LinkedList<>();
        double costoTotal = 0;
        int restante = cantidadSalida;

        for (TicketAlmacen ticket : lista) {
            if (!ticket.getEntrada().equals("0") && !ticket.getEntrada().isEmpty()) {
                int cant = Integer.parseInt(ticket.getEntrada());
                double costo = Double.parseDouble(ticket.getAdquisicion());
                inventario.add(new Double[]{(double) cant, costo});
            }
        }

        while (restante > 0 && !inventario.isEmpty()) {
            Double[] lote = inventario.peek();
            int cantLote = lote[0].intValue();
            double precio = lote[1];

            if (cantLote <= restante) {
                costoTotal += cantLote * precio;
                restante -= cantLote;
                inventario.poll(); // consumir lote
            } else {
                costoTotal += restante * precio;
                lote[0] -= restante;
                restante = 0;
            }
        }

        return costoTotal;
    }
	
	public static double calcularUEPS(ObservableList<TicketAlmacen> lista, int cantidadSalida) {
        Stack<Double[]> inventario = new Stack<>();
        double costoTotal = 0;
        int restante = cantidadSalida;

        for (TicketAlmacen ticket : lista) {
            if (!ticket.getEntrada().equals("0") && !ticket.getEntrada().isEmpty()) {
                int cant = Integer.parseInt(ticket.getEntrada());
                double costo = Double.parseDouble(ticket.getAdquisicion());
                inventario.push(new Double[]{(double) cant, costo});
            }
        }

        while (restante > 0 && !inventario.isEmpty()) {
            Double[] lote = inventario.peek();
            int cantLote = lote[0].intValue();
            double precio = lote[1];

            if (cantLote <= restante) {
                costoTotal += cantLote * precio;
                restante -= cantLote;
                inventario.pop();
            } else {
                costoTotal += restante * precio;
                lote[0] -= restante;
                restante = 0;
            }
        }

        return costoTotal;
    }
	
	public static double calcularPromedioPonderado(ObservableList<TicketAlmacen> lista, int cantidadSalida) {
        int totalCantidad = 0;
        double totalCosto = 0;

        for (TicketAlmacen ticket : lista) {
            if (!ticket.getEntrada().equals("0") && !ticket.getEntrada().isEmpty()) {
                int cant = Integer.parseInt(ticket.getEntrada());
                double costo = Double.parseDouble(ticket.getAdquisicion());

                totalCantidad += cant;
                totalCosto += cant * costo;
            }
        }

        double promedio = totalCosto / totalCantidad;
        return cantidadSalida * promedio;
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
