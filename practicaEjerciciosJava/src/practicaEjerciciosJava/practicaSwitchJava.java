package practicaEjerciciosJava;

import java.util.Scanner;

public class practicaSwitchJava {
	
	public static void main (String [] args) {
		
		final int estandar = 5;
		final int vip = 10;
		final int premium = 20;
		
		Scanner myScanner = new Scanner(System.in);
		
		int typeCostumer = 0;
		
		do {
			System.out.println("Ingrese cual es su tipo de cliente (Solo valor numerico sin puntos): \n"
					+          "1. Premium. \n"
					+          "2. VIP. \n"
					+ 		   "3. Estandar. \n"
					+          "Insertar: ");
			
			typeCostumer = myScanner.nextInt();
			
			if (typeCostumer != 1 && typeCostumer !=2 && typeCostumer !=3) {
				System.out.println("Ingrese un valor valido");
			}
		} while (typeCostumer != 1 && typeCostumer !=2 && typeCostumer !=3);
		
		switch (typeCostumer) {
		
			case 1:
				System.out.println("Su porcentaje de descuento es: " + premium + "%");
				break;
			case 2:
				System.out.println("Su porcentaje de descuento es: " + vip + "%");
				break;
			case 3:
				System.out.println("Su porcentaje de descuento es: " + estandar + "%");
				break;
		}
	}

}
