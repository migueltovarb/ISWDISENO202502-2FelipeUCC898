package gananciaDeUva;

import java.util.Scanner;

public class gananciaDeUva {
	public static void main (String[] args) {
		//Como productor de uva,
		//quiero ingresar el tipo y tamaño de uva junto con su precio inicial y cantidad vendida,
		//para conocer la ganancia total después de aplicar los ajustes de precio.
		
		Scanner myScanner = new Scanner(System.in);
		double costPerKg;
		do {
		    System.out.print("Ingrese el precio inicial por kilo de uva: ");
		    costPerKg = myScanner.nextDouble();

		    if (costPerKg <= 0) {
		        System.out.println("Error: el valor debe ser mayor a 0.");
		    }

		} while (costPerKg <= 0);
		char type;
			
		do {
		    System.out.print("Ingrese el tipo de uva (A O B): ");
		    type = myScanner.next().toUpperCase().charAt(0);

		    if (type != 'A' && type != 'B') {
		        System.out.println("Error: el valor debe ser A o B.");
		    }

		} while (type != 'A' && type != 'B');
		
		int size;
		
		do {
		    System.out.print("Ingrese el tamaño de la uva (1 O 2): ");
		    size = myScanner.nextInt();
		    

		    if (size != 1 && size != 2) {
		        System.out.println("Error: el valor debe ser 1 o 2.");
		    }
		} while (size != 1 && size != 2);
		
		if (type == 'A' && size == 1) {
			costPerKg += 0.20;	
		} else if (type == 'A' && size == 2) {
			costPerKg += 0.30;
		} else if (type == 'B' && size == 1) {
		    costPerKg -= 0.30;
		} else if (type == 'B' && size == 2) {
		    costPerKg -= 0.50;
		}
		double kgSold;
		do {
			System.out.println("ingrese la cantidad de kilos vendidos: ");
			
			kgSold= myScanner.nextDouble();
				
		} while (kgSold <= 0);
		
		double totalRevenue = costPerKg * kgSold;
		
		System.out.println("El precio AJUSTADO de la uva es: "+ costPerKg + " y la ganancia total obtenida es: " + totalRevenue);
		
	}

}
