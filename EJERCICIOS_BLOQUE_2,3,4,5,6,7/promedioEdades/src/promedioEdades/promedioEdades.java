package promedioEdades;

import java.util.Scanner;

public class promedioEdades {
	public static void main(String[] args) {
		//Como usuario del sistema,
		//quiero ingresar las edades de un grupo de alumnos y obtener el promedio,
		//para conocer la edad promedio del grupo de manera eficiente
		
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de alumnos: ");
		int firstValue = myScanner.nextInt();
		
		if (firstValue <= 0) {
			System.out.println("Ingrese un valor numerico mayor a 0: ");		
			}
		
		double totalAges = 0;
		
		for (int i = 1; i <= firstValue; i ++) {
			double age = 0;
			do {
				System.out.println("Ingresa la edad de su alumno " + i + ": ");
				age = myScanner.nextInt();
				
				if (age < 0) {
					System.out.println("La edad no puede ser 0 ");
					
				}
			} while (age < 0 );
			
			totalAges += age;
		}
		
		double average = totalAges / firstValue;
		
		System.out.println("La edad promedio del grupo es: " + average);
		
		
	}

}
