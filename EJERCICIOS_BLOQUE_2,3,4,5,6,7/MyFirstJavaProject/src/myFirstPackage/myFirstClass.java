package myFirstPackage;

import java.util.Scanner;

public class myFirstClass {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Hola, Bienvenido");
		System.out.println("Dame tu nombre");
		String name= myScanner.nextLine();
		System.out.println("Dame tu edad");
		int age= myScanner.nextInt();
		
		System.out.println("hola " + name + " tienes " + age + " años." );
	}

}
