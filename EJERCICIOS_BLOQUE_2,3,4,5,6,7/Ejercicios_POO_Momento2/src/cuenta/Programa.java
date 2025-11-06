package cuenta;

import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Cuenta miCuenta = new Cuenta("Emiliano" , 3000);
		
		System.out.println(miCuenta);
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Ingrese una cantidad que see añadir a la cuenta: ");
		
		double cantidad = myScanner.nextDouble();
		
		miCuenta.ingresar(cantidad);
		
		System.out.println(miCuenta);
		
		System.out.println("Ingrese un cantidad que desee retirar: ");
		
		double retirar = myScanner.nextDouble();
		
		miCuenta.retirar(retirar);
		
		System.out.println(miCuenta);
	}
}
