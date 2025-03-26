package polimorfismo1;
import java.util.*;
public class Salon {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		
		Estudiante[] estudiante = new Estudiante[n];
		Profesor[] profesor = new Profesor[10];
		Aula[] aula = new Aula[2];
		
		for(int i=0; i<n; i++) {
			estudiante[i] = new Estudiante();
		}
		for(int i=0; i<profesor.length; i++) {
			profesor[i] = new Profesor();
		}
		generarDatos(profesor, estudiante, aula);
		estudiante[0].Asistencia(estudiante, profesor);
		profesor[0].Asistencia(estudiante, profesor);

	}

	public static void generarDatos(Profesor[] p, Estudiante[] e, Aula[] a) {
		Random random = new Random();
		
		String[] nombres = {"Dandi","Jesus","L30","Cachora","Maghuire","Erik","Perez","Adrian","Hommey","Barbero","Elee"};
		String [] profesores = {"Lopez","Acosta","Aldo","Beatriz","Ibarra","Rochin","Edmundo","Maru","Chino","Heras", "Dire"};
		String[] materias = {"PROGRAMACION", "CONTABILIDAD", "QUIMICA"};
		char[] generos = {'M', 'F'};
		
		int materiaPos = 0;
		String materia = "";
		String profesor = " ";
		
		int namePos = 0;
		String nombre = " ";
		
		int genrePos = 0;
		char genero = ' ';
		
		int numAula = 0;
		
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
			namePos = random.nextInt(10);
			genrePos = random.nextInt(2);
			genero = generos[genrePos];
			profesor = profesores[namePos];
			materiaPos = random.nextInt(3);
			materia = materias[materiaPos];
			p[i].setMateria(materia);
			p[i].setNombre(profesor);
			p[i].setGenero(genero);
			p[i].setEdad(random.nextInt(30, 81));
		}
		
		for(int i=0; i<a.length; i++) {
			numAula = random.nextInt(1, 10);
			materiaPos = random.nextInt(3);
			materia = materias[materiaPos];
			a[i].setMateria(materia);
			a[i].setNumAlumno(e.length);
			a[i].setNumAula(numAula);
		}
	}
	
}
