package Herencia;
import java.util.Random;
public class Escuela {
	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		
		Alumno[] alumnos = new Alumno[n];
		for(int i=0; i<n; i++) {
			alumnos[i] = new Alumno();
		}
		
	}
	
	public static void capturarDatos(Alumno[] a) {
		Random random = new Random();
		int cal1 = 0, cal2 = 0, cal3 = 0, cal4 = 0, numControl = 0;
		int generoPos = 0, namePos = 0, carreraPos = 0;
		String[] names = {"Pepe", "Cachora", "Chuy", "Dandi", "JL", "Renato", "Harry", "Maguire", "Dez", "Perez", "Jairo"};
		char[] genres = {'M', 'F'};
		char[] Carreras = {'S', 'T'};
		char genero = ' ', carrera = ' ';
		String nombre = " ", numeroControl = " ";
		
		for(int i=0; i<a.length; i++) {
			namePos = random.nextInt(10);
			generoPos = random.nextInt(2);
			carreraPos = random.nextInt(2);
			numControl = random.nextInt(20000, 30001);
			cal1 = random.nextInt(101);
			cal2 = random.nextInt(101);
			cal3 = random.nextInt(101);
			cal4 = random.nextInt(101);
			nombre = names[namePos];
			genero = genres[generoPos];
			carrera = Carreras[carreraPos];
			numeroControl = Integer.toString(numControl);
			a[i] = new Alumno(nombre, genero, numeroControl, carrera, cal1, cal2, cal3, cal4);
		}
	}

}
