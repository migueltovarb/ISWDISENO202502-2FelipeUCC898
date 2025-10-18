package practicaEjerciciosJava;

import java.util.Scanner;

public class PracticaBreakJava {
	
	public static void main (String [] args) {
		
		 double[] myNumbers = new double[5];
		 
		 myNumbers[0] = 80;
	     myNumbers[1] = -5;
	     myNumbers[2] = -3;
	     myNumbers[3] = 2;
	     myNumbers[4] = 200;
	     
	     Scanner myScanner = new Scanner(System.in);
	     System.out.println("Ingrese un valor que desee buscar dentro de el array");
	     double numberToSearch = myScanner.nextDouble();
	     boolean found = false;
	     
	     for (int i = 0; i < myNumbers.length ; i++) {
	    	 
	    	 	if (numberToSearch == myNumbers[i]) {
	    	 		System.out.println("La posicion del valor ingresado es: " + i);
	    	 		found = true;
	    	 		break;
	    	 		
	    	 	}	 
	     }
	     
	     if (!found) {
	            System.out.println("El valor no existe en el arreglo.");
	        }
	     
	}

}
