package ejerciciosJavaSemana4;

import java.util.Scanner;

public class revenuePerGrape {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        double costPerKg = 0;
        String typeGrape = "";
        int sizeGrape = 0;
        double soldKg = 0;


        do {
            System.out.println("Ingrese el precio inicial por kilo de uva:");
            costPerKg = myScanner.nextDouble();

            if (costPerKg < 0) {
                System.out.println("Ingrese un valor válido.");
            }
        } while (costPerKg < 0);

        // Limpiar el buffer antes de usar nextLine()
        myScanner.nextLine();

        // Validación del tipo de uva
        do {
            System.out.println("Ingrese el tipo de uva (A o B):");
            typeGrape = myScanner.nextLine().toUpperCase();

            if (!typeGrape.equals("A") && !typeGrape.equals("B")) {
                System.out.println("Ingrese un valor válido. Solo A o B.");
            }

        } while (!typeGrape.equals("A") && !typeGrape.equals("B"));

        // Validación del tamaño
        do {
            System.out.println("Ingrese el tamaño de uva (1 o 2):");
            sizeGrape = myScanner.nextInt();

            if (sizeGrape != 1 && sizeGrape != 2) {
                System.out.println("Ingrese un tamaño válido: 1 o 2.");
            }

        } while (sizeGrape != 1 && sizeGrape != 2);

        // Aplicación de las condiciones
        if (typeGrape.equals("A") && sizeGrape == 1) {
            costPerKg += 0.20;
        } else if (typeGrape.equals("A") && sizeGrape == 2) {
            costPerKg += 0.30;
        } else if (typeGrape.equals("B") && sizeGrape == 1) {
            costPerKg -= 0.30;
        } else if (typeGrape.equals("B") && sizeGrape == 2) {
            costPerKg -= 0.50;
        }

 
        do {
            System.out.println("Ingrese la cantidad de kilos vendidos:");
            soldKg = myScanner.nextDouble();

            if (soldKg < 0) {
                System.out.println("Ingrese una cantidad válida.");
            }

        } while (soldKg < 0);

        double totalRevenue = costPerKg * soldKg;

        System.out.printf("El ingreso total por %.2f kg vendidos es: %.2f\n", soldKg, totalRevenue);

        myScanner.close(); 
    }
}
