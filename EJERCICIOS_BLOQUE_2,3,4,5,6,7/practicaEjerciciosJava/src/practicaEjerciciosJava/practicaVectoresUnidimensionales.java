package practicaEjerciciosJava;

import java.util.Scanner;

public class practicaVectoresUnidimensionales {
	
	public static void main(String [] args) {
		
		int grades = 0;
		
		 Scanner myScanner = new Scanner(System.in);
		 
		 do {
			 
			 System.out.println("ingrese la cantidad de calificaciones que desee incluir: ");
			 grades = myScanner.nextInt();
			 
			 if (grades <0 ) {
				 System.out.println("Valor incorrecto: ");
			 }
		 } while (grades < 0); 
		 
		 double[] gradesArray = new double[grades];
		 double total = 0;
		 
		 for (int i = 0 ; i < grades ; i ++ ) {
			 
			 double grade = 0;
			 do {
				 System.out.println("Ingrese la calificacion del estudiante: " + (i + 1) + ":");
				 grade = myScanner.nextDouble();
				 
				 if (grade <= 0) {
					 System.out.println("Ingrese un valor valido");
				 }
			 } while (grade <= 0 );
			 
			 gradesArray[i] = grade;
			 total += gradesArray[i];
			 
		 }
		 
		 double resultAverage = total / grades;
		 System.out.println("El promedio de notas del salon es: " + resultAverage);

		 double min = gradesArray[0];
	     double max = gradesArray[0];
		 
		 for (int i = 0 ; i < grades ; i++) {
			 if (gradesArray[i] < min) min = gradesArray[i];
			 if (gradesArray[i] > max) max = gradesArray[i];
		 }
		 
		 System.out.println("El valor minimo es: " + min);
		 System.out.println("El valor maximo es: " + max);
	    
	}
	

}
