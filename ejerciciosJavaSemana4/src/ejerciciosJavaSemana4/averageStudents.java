package ejerciciosJavaSemana4;

import java.util.Scanner;

public class averageStudents {
	
	
	public static void main (String[] args ) {
		
		Scanner myScanner = new Scanner(System.in);
		
		int students = 0;
		int suma = 0;
	    
	    System.out.println("Ingrese la cantidad de alumnos.");
	    students = myScanner.nextInt();
	    
	    int[] agesStudents = new int[students];
	    
	    for (int i = 0; i< students ; i ++) {
	    	int ages = 0;
	    	
	    	do {
	    		System.out.println("Ingrese la edad del estudiante " + (i + 1) + ":" );
		    	ages = myScanner.nextInt();
		    	
		    	if (ages < 0) {
		    		System.out.println("Ingrese un valor valido, mayor a 0 y numerico");
		    	}
		    	
	    	} while (ages < 0); 
	    	
	    	agesStudents[i] += ages;
	    }
	    
	    for (int i = 0; i< students ; i++) {
	    	suma += agesStudents[i];
	    }
	    double averageAges = (double)suma / students;
	    
	    System.out.println("El promedio de edades es: " + averageAges);
	    
	    int min = agesStudents[0];
	    int max = agesStudents[0];
	    
	    for (int i = 0; i< students; i++) {
	    	
	    	if (agesStudents [i] < min) {
	    		min = agesStudents[i];
	    	}
	    	if (agesStudents [i] > max) {
	    		max = agesStudents[i];
	    	}
	    }
	    
	    System.out.println("El valor minimo es: " + min);
	    System.out.println("El valor maximo es: " + max);
	}	
}