package ejerciciosJavaSemana4;

import java.util.Scanner;
import java.util.Arrays;

public class averageTemps {
	
	public static void main (String[] args) {
		
		
		//Atributes
		Scanner myScanner = new Scanner(System.in);
		
		final int TEMP_ALTA = 30;
		int temp = TEMP_ALTA;
		double [] temps = new double[7];
		
		double suma = 0;
		double averageTemps = 0;

		
		int nextWeek = 1;
		
		//Logica
		
		
		for (int i = 0; i < 7; i++) {
			
			System.out.println("Ingrese la temperatura del dia " + days[i]);
			temps[i] = myScanner.nextDouble();
			suma += temps[i];
			
		}
		
			do {
				
				for (int i = 0; i < 7 ; i++) {
					
					switch (i) {
						case 0:
							System.out.println("Ingresa la temperatura para el dia Lunes: ");
							temps[i] = myScanner.nextDouble();
							break;
						
						case 1:
							System.out.println("Ingresa la temperatura para el dia Martes: ");
							temps[i] = myScanner.nextDouble();
							break;
						case 2:
							System.out.println("Ingresa la temperatura para el dia Miercoles: ");
							temps[i] = myScanner.nextDouble();
							break;
						case 3:
							System.out.println("Ingresa la temperatura para el dia jueves: ");
							temps[i] = myScanner.nextDouble();
							break;
						case 4:
							System.out.println("Ingresa la temperatura para el dia Viernes: ");
							temps[i] = myScanner.nextDouble();
							break;
						case 5:
							System.out.println("Ingresa la temperatura para el dia Sabado: ");
							temps[i] = myScanner.nextDouble();
							break;
						case 6:
							System.out.println("Ingresa la temperatura para el dia Domingo: ");
							temps[i] = myScanner.nextDouble();
							break;
							
					}
				}
				
				double min = temps[0];
				double max = temps[0];
				
				for (int i = 0; i < 7; i++ ) {
					suma += temps[i];
					
					if (temps[i] < min ) {
						min = temps[i];
					}
					
					if (temps[i] > max) {
						max = temps[i];
					}
				}
				
				averageTemps = (double) suma / 7;
				
				System.out.println("El promedio de temperatura en la semana es: " + averageTemps + "°");
				System.out.println("La temperatura minima en la semana es: " + min + "°");
				System.out.println("La temperatura maxima en la semana es: " + max + "°");
				
				System.out.println("Deseas calcular otra semana? SI = 1 , NO= 0 ");
				nextWeek = myScanner.nextInt();
				
				
				if (nextWeek == 1) {
					suma = 0;
				}
				
			} while (nextWeek == 1);
			
			
			
			
			
	}
	
}
