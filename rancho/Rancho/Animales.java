package Rancho;
import java.util.*;
public class Animales {
	static Random random;
	public static void main(String[] args) {
		Random random = new Random();
		int N = random.nextInt(100, 501);
		Vaca[] Vacas = new Vaca[N];
		
		for(int i=0; i<N; i++) {
			Vacas[i] = new Vaca();
		}
		Ordena(Vacas);
		Produccion(Vacas);
		
	}
	
	public static void Ordena(Vaca[] c) {
		Random random = new Random();
		String[] nombres = {"Rancho Cachora","Rancho Elpepe", "Rancho Tilin"};
		int name = random.nextInt(0, 3);
		String nombre = nombres[name];
		
		int tipo = 0, variante = 0;
		for(int i=0; i<c.length; i++) {
			tipo = random.nextInt(1, 3);
			if(tipo == 2) {
				variante = 1;
			}else {
				variante = random.nextInt(1, 3);
			}
			c[i] = new Vaca(nombre, tipo, variante, 0);
		}
	}

	public static void Produccion(Vaca[] c) {
		Random random = new Random();
		int dias = random.nextInt(5, 11), litros = 0;
		int vaca1 = 0, vaca2 = 0, vaca3 = 0;
		int porcentaje1=0, porcentaje2=0,porcentaje3=0;
		int produccion = 0;
		for(int i=0; i<c.length; i++) {
			if(c[i].getTipo() == 1) {
				if(c[i].getVariante() == 1) {
					produccion = random.nextInt(3, 6);
					litros = produccion * dias;
					vaca1++;
				}
				if(c[i].getVariante() == 2) {
					produccion = random.nextInt(20, 31);
					litros = produccion * dias;
					vaca2++;
				}
			}else {
				produccion = random.nextInt(1, 3);
				litros = produccion * dias;
				vaca3++;
			}
			porcentaje1 = vaca1 / c.length;
			porcentaje2 = vaca2 / c.length;
			porcentaje3 = vaca3 / c.length;
			
			
			c[i] = new Vaca(c[i].getNombre(), c[i].getTipo(), c[i].getVariante(), litros);
		}
		System.out.println("produccion de leche en el " + c[0].getNombre());
		System.out.println("total de vacas ordenadas durante "+ dias + ":" + c.length);
		
		
		
	}
}
