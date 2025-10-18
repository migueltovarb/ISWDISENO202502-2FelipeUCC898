package cajeroAutomaticoPOO;

import java.util.Scanner;

public class MainCajero {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Cajero cajero = new Cajero();

        int operation;
        do {
            System.out.println("\n=== Cajero Automático (POO) ===");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Depositar Dinero.");
            System.out.println("3. Retirar Dinero.");
            System.out.println("4. Salir.");
            System.out.print("Elige la opción: ");
            operation = myScanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Su saldo actual es: $" + cajero.consultarSaldo());
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = myScanner.nextDouble();
                    if (cajero.depositar(deposito)) {
                        System.out.println("Depósito exitoso. Saldo actual: $" + cajero.consultarSaldo());
                    } else {
                        System.out.println("Error: ingrese un valor válido.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = myScanner.nextDouble();
                    if (cajero.retirar(retiro)) {
                        System.out.println("Retiro exitoso. Saldo actual: $" + cajero.consultarSaldo());
                    } else {
                        System.out.println("Error: saldo insuficiente o valor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción inválida, elige entre 1 y 4.");
                    break;
            }
        } while (operation != 4);

        myScanner.close();
    }
}
