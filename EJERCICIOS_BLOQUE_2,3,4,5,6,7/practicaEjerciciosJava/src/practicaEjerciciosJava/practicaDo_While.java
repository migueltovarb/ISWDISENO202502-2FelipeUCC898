package practicaEjerciciosJava;

import java.util.Scanner;
public class practicaDo_While {
	
	public static void main (String [] args) {
		int numbers = 0;
		int newValue = 0;
		
		Scanner myScanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese cualquier valor, si ingresa el valor 0 la operacion termina");
			newValue = myScanner.nextInt();
			
			numbers += newValue;
		} while (newValue !=0);
		System.out.println(numbers);
	}

}
