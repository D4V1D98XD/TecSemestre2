package Empleados;
import java.util.*;
public class Empresa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cantidad de empleados a consultar: ");
		int n = scan.nextInt();
		Empleados[] empleados = new Empleados[n];
		for(int i=0; i<n; i++) {
			empleados[i] = new Empleados();
		}
		
		datosEmpleados(empleados, n);

	}
	
	public static void datosEmpleados(Empleados[] c, int n) {
		Random random = new Random();
		//names
		String[] nombres = {"Pepe","Chuy", "Dandi", "Boynas", "Leo", "Julio", "Erik", "Perez", "Adrian", "Harry"};
		String nombre;
		//genre
		char[] genero = {'M', 'F'};
		char genre;
		//positions
		int num = 0, num2 = 0, sueldoHora=0, horasTrabajadas = 0;
		
		for(int i=0; i<n; i++) {
			num = random.nextInt(10);
			num2 = random.nextInt(2);
			sueldoHora = random.nextInt(40, 101);
			horasTrabajadas = random.nextInt(10, 61);
			nombre = nombres[num];
			genre = genero[num2];
			c[i].setNombre(nombre);
			c[i].setGenero(genre);
			c[i].setSueldoHora(sueldoHora);
			c[i].setHorasTrabajadas(horasTrabajadas);
		}
	}
	
	public static void pagoTotal(Empleados[] c, int n) {
		int pagoTotal = 0;
		
		for(int i=0; i<n; i++) {
			pagoTotal = c[i].getHorasTrabajadas() * c[i].getPagoTotal();
		}
	}
}
