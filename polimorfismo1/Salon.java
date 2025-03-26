package polimorfismo1;
import java.util.*;
public class Salon {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		
		Estudiante[] estudiante = new Estudiante[n];
		Profesor[] profesor = new Profesor[n];
		Aula[] aula = new Aula[2];
		
		for(int i=0; i<n; i++) {
			estudiante[i] = new Estudiante();
		}
		for(int i=0; i<profesor.length; i++) {
			profesor[i] = new Profesor();
		}
		generarDatos(profesor, estudiante, aula);

	}
	
	public  static void imprimirAulas(Profesor[] p, Estudiante[] e, Aula[] a) {
		System.out.println("TECNOLOGICO DE CULIACAN");
		System.out.println("=====================================");
		for(int i=0; i<i; i++) {
			System.out.println();
		}
	}

	public static void generarDatos(Profesor[] p, Estudiante[] e, Aula[] a) {
		Random random = new Random();
		boolean asistencia = false;
		String[] nombres = {"Dandi","Jesus","L30","Cachora","Maghuire","Erik","Perez","Adrian","Hommey","Barbero","Elee"};
		String [] profesores = {"Lopez","Acosta","Aldo","Beatriz","Ibarra","Rochin","Edmundo","Maru","Chino","Heras", "Selene"};
		String[] materias = {"PROGRAMACION", "CONTABILIDAD", "QUIMICA"};
		char[] generos = {'M', 'F'};
		
		int materiaPos = 0;
		String materia = "";
		String profesor = " ";
		
		int namePos = 0;
		String nombre = " ";
		int edad = 0;
		int calificacion = 0;
		int genrePos = 0;
		char genero = ' ';
		
		int numAula = 0;
		
		for(int i = 0; i<e.length; i++) {
			namePos = random.nextInt(10);
			nombre = nombres[namePos];
			genrePos = random.nextInt(2);
			genero = generos[genrePos];
			edad = random.nextInt(17, 30);
			calificacion = random.nextInt(101);
			asistencia = e[i].Asistencia();
			e[i] = new Estudiante(nombre, edad, genero, calificacion, asistencia);
		}
		
		for(int i=0; i<p.length; i++) {
			namePos = random.nextInt(10);
			genrePos = random.nextInt(2);
			genero = generos[genrePos];
			profesor = profesores[namePos];
			materiaPos = random.nextInt(3);
			materia = materias[materiaPos];
			edad = random.nextInt(30, 81);
			asistencia = p[i].Asistencia();
			p[i] = new Profesor(profesor, edad, genero, materia, asistencia);
		}
		
		for(int i=0; i<a.length; i++) {
			numAula = random.nextInt(1, 10);
			materiaPos = random.nextInt(3);
			materia = materias[materiaPos];
			int numAlumno = e.length;
			a[i] = new Aula(numAula, numAlumno, materia);

		}
	}
	
}
