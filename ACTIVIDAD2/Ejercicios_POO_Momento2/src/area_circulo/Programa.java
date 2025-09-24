package area_circulo;

import java.util.Scanner;

public class Programa {
	
	public static void main (String [] args) {
		
		
		Circulo miCirculo = new Circulo();
		
		System.out.println(miCirculo);
		
		
		
		System.out.println("Ingrese el radio de su circulo: ");
		
		Scanner miScanner = new Scanner(System.in);
		
		double radioLeido=miScanner.nextDouble();
		
		miCirculo.setRadio(radioLeido);
		
		System.out.println(miCirculo);
		
		System.out.println("El area del circulo es: " + miCirculo.getArea());
		
		System.out.println("La circunferencia del circulo es: " + miCirculo.getCircumference());
		
		miScanner.close();
	
		
	}
	

}