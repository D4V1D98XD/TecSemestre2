package polimorfismo1;
import java.util.*;
public class Salon {
		//GARCIA LEYVA LEONARDO DAVID
		//GASTELUM MEDINA JESUS ARMANDO
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
		Random random = new Random();
		boolean asistencia;
		Integer[] contador = new Integer[2];
		int calificacion = 0;
		System.out.println("==================================================================");
		System.out.println("              TECNOLOGICO DE CULIACAN");
		System.out.println("==================================================================");
		for(int i=0; i<a.length; i++) {
			System.out.println("Numero de Aula: " + a[i].getNumAula()+"\t"+"Materia: " + a[i].getMateria()+"\t"+"Num Alumnos: " + a[i].getNumAlumno());
			if(a[i].getMateria() == p[i].getMateria()) {
				System.out.println(p[i].ToString());
			}
			if(p[i].isAsistencia() == true) {
				System.out.println("==================================================================");
				System.out.println("Nombre"+"\t"+"\t"+"Edad"+"\t"+"Genero"+"\t"+"Calificacion"+"\t"+"Asistencia");
				for(int j=0; j<e.length; j++) {
					
					calificacion = random.nextInt(101);
					e[j].setCalificacion(calificacion);
					asistencia = e[j].Asistencia();
					e[j].setAsistencia(asistencia);
					System.out.println(e[j].ToString());
				}
				contador = asistenciaClases(e);
				System.out.println("ASISITIO:"+ contador[1] +"\t"+ "NO ASISTIO: "+ contador[0]);
				System.out.println("==================================================================");
				System.out.println("ALUMNOS QUE PASARON");
				for(int j=0; j<e.length; j++) {
					if(e[j].getCalificacion() >= 70 && e[j].getGenero() == 'M') {
						System.out.println(e[j].ToString());
					}
				}
				System.out.println("==================================================================");
				System.out.println("ALUMNAS QUE PASARON");
				for(int j=0; j<e.length; j++) {
					if(e[j].getCalificacion() >= 70 && e[j].getGenero() == 'F') {
						System.out.println(e[j].ToString());
					}
				}
			}else {
				System.out.println("El profesor no asistio a clase");
			}
			
			System.out.println("==================================================================");
		}
	}

	public static Integer[] asistenciaClases(Estudiante[] e) {
		int  numAlumnos = 0, mitad = 0;
		Integer[] contador = new Integer[2];
		contador[0] = 0;
		contador[1] = 0;
		numAlumnos = e.length;
		for(int i=0; i<e.length; i++) {
			if(!e[i].isAsistencia()) {
				contador[0]++;
			}else {
				contador[1]++;
			}
		}
		mitad = numAlumnos / 2;
		if(contador[0] > mitad) {
			System.out.println("La clase no inicio por falta de alumnos");
		}
		return contador;
	}
	
	public static void generarDatos(Profesor[] p, Estudiante[] e, Aula[] a) {
		Random random = new Random();
		boolean asistencia = false;
		String[] nombres = {"Dandi","Jesus","L30","Cachora","pepe","Erik","Perez","Adrian","Hommey","Barbero","Elee", "David"};
		char[] generos = {'M', 'F'};
		
		int namePos = 0;
		String nombre = " ";
		int edad = 0;
		int calificacion = 0;
		int genrePos = 0;
		char genero = ' ';
		
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
