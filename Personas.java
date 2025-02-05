package Persona;

public class Personas {
	public static void main(String[] args) {
		Persona[] personas = new Persona[5];
		leeDatos(personas);
		
		
	}
	
	public static void leeDatos(Persona P[]) {
		
		String nombre; int edad; char genero;
		for(int p=0; p<P.length; p++) {
			System.out.println("\nPersona "+ (p + 1));
			
			System.out.println("Nombre: ");
			nombre = Leer.dato();
			
			System.out.println("Edad: ");
			edad = Leer.datoInt();
			
			do {
				System.out.print("Genero? (M masculino, F femenino): ");
				genero = Leer.datocar();
			}while(genero != 'M' && genero != 'F');
			
			P[p] = new Persona(nombre, genero, genero);
			System.out.println();
		}
	}
	
	public static void imprimeDatos(Persona P[]) {
		for(int p=0; p<P.length; p++) {
			System.out.println(P[p].ToString());
		}
	}

}
