package polimorfismo1;
import java.util.*;
public class Salon {

	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		Estudiante[] estudiante = new Estudiante[n];
		Profesor[] profesor = new Profesor[3];
		Aula[] aula = new Aula[3];
		
		for(int i=0; i<n; i++) {
			estudiante[i] = new Estudiante();
		}
		for(int i=0; i<profesor.length; i++) {
			profesor[i] = new Profesor();
		}
		generarDatos(profesor, estudiante, aula);
		imprimirAulas(profesor, estudiante, aula);

	}
	
	public  static void imprimirAulas(Profesor[] p, Estudiante[] e, Aula[] a) {
		System.out.println("=======================================================");
		System.out.println("              TECNOLOGICO DE CULIACAN");
		System.out.println("=======================================================");
		for(int i=0; i<a.length; i++) {
			System.out.println("Numero de Aula: " + a[i].getNumAula()+"\t"+"Materia: " + a[i].getMateria()+"\t"+"Num Alumnos: " + a[i].getNumAlumno());
			if(a[i].getMateria() == p[i].getMateria()) {
				System.out.println(p[i].ToString());
			}
		}
		System.out.println("=======================================================");
		System.out.println("Nombre"+"\t"+"\t"+"Edad"+"\t"+"Genero"+"\t"+"Calificacion"+"\t"+"Asistencia");
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].ToString());
		}
	}

	public static void generarDatos(Profesor[] p, Estudiante[] e, Aula[] a) {
		Random random = new Random();
		boolean asistencia = false;
		String[] nombres = {"Dandi","Jesus","L30","Cachora","pepe","Erik","Perez","Adrian","Hommey","Barbero","Elee", "David"};
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
		int numAlumno = 0;
		
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
			asistencia = p[0].Asistencia();
			p[0] = new Profesor("Lopez", 80, 'M', "PROGRAMACION", asistencia);
			asistencia = p[1].Asistencia();
			p[1] = new Profesor("Chino", 34, 'M', "CONTABILIDAD", asistencia);
			asistencia = p[2].Asistencia();
			p[2] = new Profesor("Beatriz", 40, 'F', "QUIMICA", asistencia);
		
			numAlumno = e.length;
			a[0] = new Aula(4, numAlumno, "PROGRAMACION");
			a[1] = new Aula(10, numAlumno, "CONTABILIDAD");
			a[2] = new Aula(3, numAlumno, "QUIMICA");
	}
	
}
