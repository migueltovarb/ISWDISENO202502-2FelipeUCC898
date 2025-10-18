package cajeroAutomatico2;

import java.util.Scanner;

public class cajeroAutomatico2 {
	
    public static void main (String[] args) {
        final double INIT_BALANCE = 1000;
        double balance = INIT_BALANCE;

        int operation;
        double deposit;
        double withdrawal;

        Scanner myScanner = new Scanner(System.in);

        do {
            System.out.println("\n=== Cajero Automático ===");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Depositar Dinero.");
            System.out.println("3. Retirar Dinero.");
            System.out.println("4. Salir.");
            System.out.print("Elige la opción: ");
            operation = myScanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("Su saldo actual es: " + balance);
                    break;

                case 2:
                    do {
                        System.out.print("Ingrese la cantidad que desea depositar: ");
                        deposit = myScanner.nextDouble();

                        if (deposit <= 0) {
                            System.out.println("Error: ingrese un valor válido.");
                        }
                    } while (deposit <= 0);

                    balance += deposit;
                    System.out.println("Su saldo ha sido actualizado a: " + balance);
                    break;

                case 3:
                    do {
                        System.out.print("Ingrese la cantidad que desea retirar: ");
                        withdrawal = myScanner.nextDouble();

                        if (withdrawal <= 0) {
                            System.out.println("Error: ingrese un valor válido.");
                        }
                    } while (withdrawal <= 0);

                    if (withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Operación exitosa, su saldo actual es: " + balance);
                    } else {
                        System.out.println("Error: saldo insuficiente.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por su visita, vuelva pronto.");
                    break;

                default:
                    System.out.println("Opción inválida, elige entre 1 y 4.");
                    break;
            }
        } while (operation != 4);

        myScanner.close();
    }
}
