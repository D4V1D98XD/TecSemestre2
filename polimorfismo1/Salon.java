package polimorfismo1;
import java.util.*;
public class Salon {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		
		Estudiante[] estudiante = new Estudiante[n];
		Profesor[] profesor = new Profesor[2];
		Aula[] aula = new Aula[2];
		
		for(int i=0; i<n; i++) {
			estudiante[i] = new Estudiante();
		}
		
		datos(profesor, estudiante, aula);

	}

	public static void datos(Profesor[] p, Estudiante[] e, Aula[] a) {
		Random random = new Random();
		String[] nombres = {"Dandi","JEsus","L30","Cachora","Maghuire","Erik","Perez","Adrian","Hommey","Barbero","Elee",};
		int namePos = 0;
		String nombre = " ";
		
		char[] generos = {'M', 'F'};
		int genrePos = 0;
		char genero = ' ';
		
		for(int i = 0; i<e.length; i++) {
			namePos = random.nextInt(10);
			nombre = nombres[namePos];
			genrePos = random.nextInt(2);
			genero = generos[genrePos];
			
			e[i].setNombre(nombre);
			e[i].setGenero(genero);
			e[i].setEdad(random.nextInt(17, 30));
			e[i].setCalificacion(random.nextInt(0, 101));
		}
		
		for(int i=0; i<p.length; i++) {
			
		}
	}
	
}
