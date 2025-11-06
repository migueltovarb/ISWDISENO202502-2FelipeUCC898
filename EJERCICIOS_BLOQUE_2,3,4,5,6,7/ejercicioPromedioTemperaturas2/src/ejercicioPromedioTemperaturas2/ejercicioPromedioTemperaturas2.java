package ejercicioPromedioTemperaturas2;

import java.util.Scanner;

public class ejercicioPromedioTemperaturas2 {
	
	
	public static void main (String[] args ) {
		
		Scanner myScanner = new Scanner(System.in);
		
		
		final int TEMP_ALTA = 30;
		int temp = TEMP_ALTA;
		double [] temps = new double[7];
		
		String[] days = { "lunes", "Martes", "Miércoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo" };

		
		double suma = 0;
		double averageTemps = 0;

		
		int nextWeek = 1;
		
		do {
			
			for (int i = 0; i < 7; i++) {
				
				System.out.println("Ingrese la temperatura del dia " + days[i]);
				temps[i] = myScanner.nextDouble();
				suma += temps[i];
			}
			
			averageTemps = (double) suma / 7;
			
			double min = temps[0];
			double max = temps[0];
			
			for (int i = 0; i < 7; i++) {
				if (temps[i] < min) {
					min = temps[i];
				}
				
				if (temps[i] > max) {
					max = temps[i];
				}	
			}
			
			System.out.println("El promedio de temperatura en la semana es: " + averageTemps + "°");
			System.out.println("La temperatura minima en la semana es: " + min + "°");
			System.out.println("La temperatura maxima en la semana es: " + max + "°");
			
			System.out.println("Deseas calcular otra semana? SI = 1 , NO= 0 ");
			nextWeek = myScanner.nextInt();
			
			if (nextWeek == 1) {
				suma = 0;
			}
		} while ( nextWeek == 1);
	}	
}
