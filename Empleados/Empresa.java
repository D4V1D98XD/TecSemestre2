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
		pagoTotal(empleados, n);
		
		for(int i=0; i<n; i++) {
			System.out.println(empleados[i].toString());
		}
		System.out.println("================================");
		promedios(empleados, n);
		mayor(empleados, n);
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
		int excedente = 0, doble = 0;
		
		for(int i=0; i<n; i++) {
			c[i].setPagoTotal(c[i].getHorasTrabajadas() * c[i].getSueldoHora());
			
			if(c[i].getHorasTrabajadas() > 40) {
				excedente = c[i].getHorasTrabajadas() - 40;
				doble = 2 * (excedente * c[i].getSueldoHora());
				c[i].setPagoTotal(c[i].getPagoTotal() + doble);
			}
		}
	}
	public static void promedios(Empleados[] c, int n) {
		int promedioMujer = 0, suma = 0, suma2 = 0, contadorMujer=0, contadorHombre = 0, promedioHombre = 0;
		int mayor=0;
		String mayorNombre = "";
		char genero = ' ';
		for(int i=0; i<n; i++) {
			if(c[i].getGenero() == 'F') {
				suma += c[i].getPagoTotal();
				contadorMujer++;
			}
			if(c[i].getGenero() == 'M') {
				suma2 += c[i].getPagoTotal();
				contadorHombre++;
			}
			
		}
		promedioMujer = suma / contadorMujer;
		promedioHombre = suma2 / contadorHombre;
		System.out.println("Pago promedio para hombres " + promedioHombre);
		System.out.println("Pago promedio para mujeres " + promedioMujer);
		System.out.println();
		
	}
	public static void mayor(Empleados[] c, int n) 
	{
		int mayor = 0, pos = 0;
		for(int i=0; i<n; i++) 
		{
			if(c[i].getPagoTotal()>mayor)
			{
				mayor = c[i].getPagoTotal();
				pos = i;
			}
			
		}
		System.out.println("El empleado que gano mas fue " + c[pos].getNombre() + " con " + mayor + " y es " + c[pos].getGenero());
	}
	
}
