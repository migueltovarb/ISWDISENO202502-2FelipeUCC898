package practicaEjerciciosJava;

import java.util.Scanner;

public class practicaCicloFor {
	
	public static void main(String [] args) {
		
		int value = 0;
		double factorial = 1;
		Scanner myScanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese un valor mayor a 0 para hallar su factorial: ");
			value = myScanner.nextInt();
			
			if (value < 0) {
				System.out.println("Ingrese un valor valido");
			}
			
		} while (value < 0);
		
		if (value == 0 || value == 1) {
			System.out.println("Resultado: 1");
		} else {
			for (int i = 2; i <= value; i++) {
				factorial *= i;
			}
			System.out.println("Resultado: " + factorial);
		}
	}

}
