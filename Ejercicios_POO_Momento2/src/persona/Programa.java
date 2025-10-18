package persona;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Persona miHumano = new Persona();
		Scanner myScanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre: ");
		String nombre = myScanner.nextLine();
		miHumano.setNombre(nombre);

		System.out.println("Ingrese la edad: ");
		int edad = myScanner.nextInt();
		miHumano.setEdad(edad);

		System.out.println("Ingrese el sexo (H/M): ");
		myScanner.nextLine(); // limpiar buffer
		char sexo = myScanner.nextLine().charAt(0);
		miHumano.setSexo(sexo);

		System.out.println("Ingrese el peso: ");
		double peso = myScanner.nextDouble();
		miHumano.setPeso(peso);

		System.out.println("Ingrese la altura: ");
		double altura = myScanner.nextDouble();
		miHumano.setAltura(altura);

		// Mostrar objeto
		System.out.println(miHumano.toString());
		
		Persona miHumano1 = new Persona (nombre, edad, sexo, peso, altura);
		Persona miHumano2 = new Persona (nombre, edad, sexo);
		Persona miHumano3 = new Persona ();
		miHumano3.setNombre("Carlos");
		miHumano3.setEdad(58);
		miHumano3.setSexo('M');
		miHumano3.setPeso(100);
		miHumano3.setAltura(1.75);
		
		
		System.out.println(miHumano1.calcularIMC());
		System.out.println(miHumano1.esMayorDeEdad());
		System.out.println(miHumano1.toString());
		System.out.println(miHumano2.toString());
		
		comprobarPeso(miHumano1, "Persona 1");
        comprobarPeso(miHumano2, "Persona 2");
        comprobarPeso(miHumano3, "Persona 3");

        comprobarMayorEdad(miHumano1, "Persona 1");
        comprobarMayorEdad(miHumano2, "Persona 2");
        comprobarMayorEdad(miHumano3, "Persona 3");

        // Mostrar información completa
        System.out.println("\n=== Información de cada persona ===");
        System.out.println(miHumano1);
        System.out.println(miHumano2);
        System.out.println(miHumano3);
	
		myScanner.close();
	}


private static void comprobarPeso(Persona p, String nombrePersona) {
    int imc = p.calcularIMC();
    switch (imc) {
        case -1:
            System.out.println(nombrePersona + " está por debajo de su peso ideal.");
            break;
        case 0:
            System.out.println(nombrePersona + " está en su peso ideal.");
            break;
        case 1:
            System.out.println(nombrePersona + " tiene sobrepeso.");
            break;
    }
}

// Método auxiliar para comprobar si es mayor de edad
private static void comprobarMayorEdad(Persona p, String nombrePersona) {
    if (p.esMayorDeEdad()) {
        System.out.println(nombrePersona + " es mayor de edad.");
    } else {
        System.out.println(nombrePersona + " es menor de edad.");
    }
}
}