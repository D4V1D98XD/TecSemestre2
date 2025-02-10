package Agenda;
import java.util.*;
public class miAgenda {
	public static void main(String[] args) {
		agenda[] contactos = new agenda[10];
		Scanner scan = new Scanner(System.in);
		menu();
		int bandera = 0;
		do {
			bandera = scan.nextInt();
			switch(bandera) {
			
				case 1:
					
					addContact();
				break;
				
				case 2:
					
				break;
					
				case 3:
					
				break;
					
				case 4:
					
				break;
					
				case 5:
					
				break;
			}
			menu();
			
		}while(bandera != 7);
		
	}
	
	public static void menu() {
		System.out.println("-------------------------");
		System.out.println("AGENDA DE CONTACTOS");
		System.out.println("1.- Añadir Contacto");
		System.out.println("2.- Existe Contacto");
		System.out.println("3.- Listar Contacto");
		System.out.println("4.- Consulta Contacto");
		System.out.println("5.- Eliminar Contacto");
		System.out.println("6.- Huecos Libres");
		System.out.println("7.- Salir");
		System.out.println("-------------------------");
	}
	
	public static String addContact() {
		String nombre;
		Scanner scan = new Scanner(System.in);
		nombre = scan.next();
		return nombre;
	}
}
