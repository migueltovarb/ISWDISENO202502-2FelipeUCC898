package deCelsiusAFarenheit;

import java.util.Scanner;

public class deCelsiusAFarenheit {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);

        System.out.println("Calculadora de Celsius a Farenheit");
        System.out.println("Ingresa el numero que deseas convertir:");
        double primeraVariable = myScanner.nextDouble();

        System.out.println("Elige la operación que deseas realizar:");
        System.out.println("1. Celsius a Farenheit");
        System.out.println("2. Farenheit a Celsius");
        System.out.print("Opción: ");
        
        int opcion = myScanner.nextInt();
        double resultado = 0;
        boolean operacionValida = true;

        switch(opcion) {
            case 1:
                resultado = (primeraVariable * 9/5) + 32;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = (primeraVariable - 32);
                System.out.println("El resultado de la resta es: " + resultado);
                break;
        }

        if (operacionValida) {
            System.out.println("Operación completada con éxito.");
        }
        
        myScanner.close();

	}

}
