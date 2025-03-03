package rancho;
import java.util.*;
public class Animales {
	static Random random;
	public static void main(String[] args) {
		int N = random.nextInt(100, 501);
		Vaca[] Vacas = new Vaca[N];
		
		for(int i=0; i<N; i++) {
			Vacas[i] = new Vaca();
		}
		Ordena(Vacas);
		Produccion(Vacas);
		
		
	}
	
	public static void Ordena(Vaca[] c) {
		for(int i=0; i<c.length; i++) {
			c[i].setTipo(random.nextInt(1, 3));
			if(c[i].getTipo() == 2) {
				c[i].setVariante(1);
			}else {
				c[i].setVariante(random.nextInt(1, 3));
			}
		}
	}

	public static void Produccion(Vaca[] c) {
		int dias = random.nextInt(5, 11);
		int produccion = 0;
		for(int i=0; i<c.length; i++) {
			if(c[i].getTipo() == 1) {
				if(c[i].getVariante() == 1) {
					produccion = random.nextInt(3, 6);
					c[i].setLitros(produccion * dias);
				}
				if(c[i].getVariante() == 2) {
					produccion = random.nextInt(20, 31);
					c[i].setLitros(produccion * dias);
				}
			}else {
				produccion = random.nextInt(1, 3);
				c[i].setLitros(produccion * dias);
			}
		}
	}
}
