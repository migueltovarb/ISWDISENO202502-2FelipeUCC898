package restaurante;

import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Restaurante miRestaurante = new Restaurante();
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Ingresa el nombre del restaurante: ");
		
		String nombre = myScanner.nextLine();
		
		miRestaurante.setNombre(nombre);
		
		miRestaurante.registrarPlatos("Mondongo", Tipo.PLATO_FUERTE, 10000);
		miRestaurante.registrarPlatos("Cuy", Tipo.PLATO_FUERTE, 50000);
		miRestaurante.registrarPlatos("Bandeja Paisa", Tipo.PLATO_FUERTE, 15000);
		miRestaurante.registrarPlatos("Pollo Broaster", Tipo.PLATO_FUERTE, 12000);
		
		miRestaurante.registrarClientes("Luis", 312586634);
		miRestaurante.registrarClientes("carlos", 312236634);
		miRestaurante.registrarClientes("Camilo", 312584534);
		miRestaurante.registrarClientes("Mercedez", 313486634);
		
		miRestaurante.toString();
		
		
	}

}
