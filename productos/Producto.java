package productos;

public class Producto {

	public static void main(String[] args) {
		Productos[] c = new Productos[10];
		c[0] = new Frescos("lata\t", "24/02/2006", "Mexico", "1234");
		c[1] = new Frescos("lata\t", "24/02/2006", "China", "4321");
		c[2] = new Refrigerados("lata\t", "21/12/2025", "Mexico", "6436", "27°\t", "w12a");
		c[3] = new Refrigerados("lata\t", "24/03/2232", "EU", "2345", "30°\t", "d112");
		c[4] = new Refrigerados("lata\t", "28/06/2023", "Canada", "5364", "27°\t", "645f");
		c[5] = new CongeladosAgua("11/11/2021", "lata", "Inglaterra", "7654", "20°\t", "10%");
		c[6] = new CongeladosAgua("01/10/2021", "lata", "Francia\t", "7556", "30°\t", "10%");
		c[7] = new CongeladosAire("02/09/2022", "1113", "Austria", "lata\t", "21°\t", 1, 2, 5, 6);
		c[8] = new CongeladosAire("05/08/2022", "6542", "Beijing", "lata\t", "12°\t", 8, 7, 2, 4);
		c[9] = new CongeladosNitrogeno("lata\t", "09/04/2022", "Sinaloa", "2222", "22°", "INDUCCION", "11");
		
		System.out.println("=========================================");
		System.out.println("Productos");
		System.out.println("=========================================");
		System.out.println("Frescos");
		System.out.println("lote\tenvasado\tPais\tCaducidad");
		for(int i=0; i<c.length; i++) {
			if(c[i] instanceof Frescos) {
				System.out.println(c[i].ToString());
			}
		}
		System.out.println("=========================================");
		System.out.println("Refrigerados");
		System.out.println("lote\tenvasado\tPais\tCaducidad\tTemperatura\tCodigo");
		for(int i=0; i<c.length; i++) {
			if(c[i] instanceof Refrigerados) {
				System.out.println(c[i].ToString());
			}
		}
		System.out.println("=========================================");
		System.out.println("Conngelados por Agua");
		System.out.println("lote\tenvasado\tPais\tCaducidad\tTemperatura\tCodigo");
		for(int i=0; i<c.length; i++) {
			if(c[i] instanceof CongeladosAgua) {
				System.out.println(c[i].ToString());
			}
		}
		System.out.println("=========================================");
		System.out.println("Congelados por Aire");
		System.out.println("lote\tenvasado\tPais\tCaducidad\tTemperatura\tNitrogeno\tOxigeno\tCarbono\tVapor");
		for(int i=0; i<c.length; i++) {
			if(c[i] instanceof CongeladosAire) {
				System.out.println(c[i].ToString());
			}
		}
		System.out.println("=========================================");
		System.out.println("Congelados por Nitrogeno");
		System.out.println("lote\tenvasado\tPais\tCaducidad\tTemperatura\tMetodo\tTiempo");
		for(int i=0; i<c.length; i++) {
			if(c[i] instanceof CongeladosNitrogeno) {
				System.out.println(c[i].ToString());
			}
		}
		
		
	}
	
}
