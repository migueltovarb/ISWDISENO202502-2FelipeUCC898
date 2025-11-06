package ejerciciosJavaSemana4;

import java.util.Scanner;

public class cajeroAutomatico {
	
	public static void main( String [] args) {
		
		final double SALDO_INICIAL = 1000;
		double saldo = SALDO_INICIAL;
		int operation = 0; 
		Scanner myScanner = new Scanner(System.in);
		
		do {
			System.out.println("Bienvenido a nuestro sistema de cajero automatico. \n"
					+          "Dime, que puedo hacer por ti \n"
					+          "1. Consultar saldo. \n"
					+          "2. Depositar dinero. \n"
					+ 		   "3. Retirar dinero. \n"
					+          "4. Salir");
			
			operation = myScanner.nextInt();
			
			switch (operation) {
			
			case 1: 
				System.out.println("Su saldo actual es: " + saldo);
				break;
				
			case 2:
				double cantidad = 0;
				
				System.out.println("Ingrese la cantidad de dinero que desea depositar");
				cantidad = myScanner.nextDouble();
				
				if (cantidad < 0 ) {
					System.out.println("Ingrese un valor valido.");
				} else {
					saldo += cantidad;
					System.out.println("¡Operacaion realizada con exito! \n"
							+          "Su saldo es: " + saldo);
				}
				break;
				
			case 3:
				double retiro = 0;
				
				System.out.println("Ingrese la cantidad de dinero que desea retirar");
				retiro = myScanner.nextDouble();
				
				if (retiro < 0 ) {
					System.out.println("Ingrese un valor valido.");
				} else {
					saldo -= retiro;
					System.out.println("¡Operacaion realizada con exito! \n"
							+          "Su saldo es: " + saldo);
				}
				break;
			case 4:
				System.out.println("Muchas gracias por su visita, vuelva pronto :D");
				break;
				
			default:
				System.out.println("Ingrese un valor valido para continuar.");
				break;				
			}
		} while (operation !=4);
	}
}
