package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora");
        System.out.println("Ingresa el primer número:");
        double primeraVariable = myScanner.nextDouble();

        System.out.println("Ingresa el segundo número:");
        double segundaVariable = myScanner.nextDouble();

        System.out.println("Elige la operación que deseas realizar:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opción: ");
        
        int opcion = myScanner.nextInt();
        double resultado = 0;
        boolean operacionValida = true;

        switch(opcion) {
            case 1:
                resultado = primeraVariable + segundaVariable;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = primeraVariable - segundaVariable;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = primeraVariable * segundaVariable;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                if (segundaVariable != 0) {
                    resultado = primeraVariable / segundaVariable;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("Operación completada con éxito.");
        }
        
        myScanner.close();
    }
}
