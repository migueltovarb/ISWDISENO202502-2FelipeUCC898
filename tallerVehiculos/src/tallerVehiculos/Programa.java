package tallerVehiculos;

import java.util.Scanner;

public class Programa {
	
	public static void main (String [] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del taller: ");
		
		String taller = myScanner.nextLine();
		
		Taller miTaller = new Taller(null, null, taller);
		
		System.out.println(miTaller);
		
		
	}

}
