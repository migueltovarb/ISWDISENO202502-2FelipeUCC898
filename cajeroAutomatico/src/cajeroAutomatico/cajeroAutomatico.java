package cajeroAutomatico;

import java.util.Scanner;

public class cajeroAutomatico {
	
	public static void main (String [] args) {
		
		final double INIT_BALANCE = 1000;
		double balance = INIT_BALANCE;
		
		int operation;
		double result;
		
		Scanner myScanner = new Scanner(System.in);
		
		do {
			System.out.println("\nElige la opcion que deseas realizar: "
					+          "\n1. Consultar Saldo."
					+          "\n2. Depositar Dinero. "
					+          "\n3. Retirar Dinero. "
					+          "\n4. Salir. " );
			operation = myScanner.nextInt();
			
			if (operation < 0 || operation > 4) {
				System.out.println("Error: Ingrese un valor valido para continuar. ");
			}
		} while ( operation < 0 || operation > 4);
		
		double deposit;
		double withdrawal;
		
		switch (operation) {
		case 1:
			result = balance;
			System.out.println("Su saldo actual es: " + result);
			break;
		case 2:
			do {
				System.out.println("Ingrese la cantidad que desea depositar");
				deposit = myScanner.nextDouble();
				
				if (deposit < 0) {
					System.out.println("Error: Ingrese un valor valido para continuar. ");
				}
			} while ( deposit < 0);
			
			double newBalance = balance + deposit;
			balance += newBalance;
			System.out.println("Su saldo ha sido actualizado a: " + newBalance);
			break;
		case 3: 
			do {
				System.out.println("Ingrese la cantidad que desea retirar");
				withdrawal = myScanner.nextDouble();
				
				if (withdrawal < 0) {
					System.out.println("Error: Ingrese un valor valido para continuar. ");
				}
			} while ( withdrawal < 0);
			
			if (withdrawal < balance) {
				double newBalanceWithdrawal = balance - withdrawal;
				balance -= withdrawal;
				System.out.println("Operacion Exitosa, su saldo actual es: " + newBalanceWithdrawal);
				break;
			} else {
				System.out.println("Error, saldo insuficiente.");
				break;
			}
		case 4:
			System.out.println("Gracias por su visita, vuelva pronto. ");
			break;
		}
	}
}
