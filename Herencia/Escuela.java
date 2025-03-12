package Herencia;
import java.util.Random;
public class Escuela {
	public static void main(String[] args) {
		Random random = new Random();
		int n = random.nextInt(10, 21);
		int carrera = random.nextInt(2);
		Alumno[] alumnos = new Alumno[n];
		for(int i=0; i<n; i++) {
			alumnos[i] = new Alumno();
		}
		capturarDatos(alumnos);
		carreraEspecifica(alumnos, carrera);
		calcularPromedio(alumnos);
		imprimirGenero(alumnos);
		promedioMasAlto(alumnos);
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
	public static void carreraEspecifica(Alumno[] a,int carrera){
		System.out.println("---------------------------------------");
		System.out.println("		CARRERA ALUMNOS");
		System.out.println("---------------------------------------");
		System.out.println("NOMBRE\tCARRERA");
		for(int i=0; i<a.length; i++) {
			if(carrera == 0 && a[i].getCarrera() == 'S') {
				System.out.println(a[i].getNombre()+"\t"+a[i].getCarrera());
			}
			if(carrera == 1 && a[i].getCarrera() == 'T') {
				System.out.println(a[i].getNombre()+"\t"+a[i].getCarrera());
			}
		}
		
	}
	public static void calcularPromedio(Alumno[] a) {
		int cal1, cal2, cal3, cal4, promedio = 0;
		for(int i=0; i<a.length; i++) {
			cal1 = a[i].getCal1(); cal2 = a[i].getCal2(); cal3 = a[i].getCal3(); cal4 = a[i].getCal4();
			promedio = (cal1 + cal2 + cal3 + cal4) / 4;
			a[i].setPromedio(promedio);
		}
		System.out.println("---------------------------------------");
		System.out.println("		PROMEDIO ALUMNOS");
		System.out.println("---------------------------------------");
		System.out.println("NOMBRE\tPROMEDIO");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i].getNombre()+"\t"+a[i].getPromedio());
		}
	}
	public static void imprimirGenero(Alumno[] a) {
		System.out.println("---------------------------------------");
		System.out.println("		GENERO ALUMNOS");
		System.out.println("---------------------------------------");
		System.out.println("NOMBRE\tGENERO\tCARRERA\tPROMEDIO");
		for(int i=0; i<a.length; i++) {
			if(a[i].getGenero() == 'F') {
				System.out.println(a[i].getNombre()+"\t"+a[i].getGenero()+"\t"+a[i].getCarrera()+"\t"+a[i].getPromedio());
			}
		}
		for(int i=0; i<a.length; i++) {
			if(a[i].getGenero() == 'M') {
				System.out.println(a[i].getNombre()+"\t"+a[i].getGenero()+"\t"+a[i].getCarrera()+"\t"+a[i].getPromedio());
			}
		}
	}
	public static void promedioMasAlto(Alumno[] a) {
		double mayor = a[0].getPromedio();
		int pos = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i].getPromedio() > mayor) {
				mayor = a[i].getPromedio();
				pos = i;
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("		PROMEDIO MAS ALTO");
		System.out.println("---------------------------------------");
		System.out.println("NOMBRE\tCARRERA\tPROMEDIO");
		System.out.println(a[pos].getNombre()+"\t"+a[pos].getCarrera()+"\t"+a[pos].getPromedio());
	}
	

}
