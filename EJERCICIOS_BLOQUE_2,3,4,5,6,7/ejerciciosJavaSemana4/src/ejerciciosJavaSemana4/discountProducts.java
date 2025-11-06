package ejerciciosJavaSemana4;

import java.util.Scanner;
import java.util.ArrayList;

public class discountProducts {
	
	public static void main(String [] args) {
		
	//Atributes
	
	int products = 0;
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> type = new ArrayList<>();
	ArrayList<Double> cost = new ArrayList<>();
	
	final double DISCOUNT_CLOTHE = 0.15;
	final double DISCOUNT_TECH = 0.5;
	final double DISCOUNT_FEED = 0.20;
	final double EXTRA_DISCOUNT = 500.000;
	
	double totalCostProducts = 0;
	double totalWithDiscount = 0;
	double save = 0;
	int repeat = 1;
	
	
	Scanner myScanner = new Scanner(System.in);
	
	do {
		
		System.out.println("Ingrese el numero de productos a comprar: ");
		products = myScanner.nextInt();
		
		
		for (int i = 0; i < products ; i ++) { 
			
			System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
			name.add(myScanner.next());
			
			do {
			    System.out.println("Ingrese el tipo del producto: \n"
			            + "1: Ropa \n"
			            + "2: Tecnologia \n"
			            + "3: Alimentos. ");
			    type.add(myScanner.nextInt());
			    

			    if (type.get(i) <= 0 || type.get(i) > 3) {
			        System.out.println("Ingrese un valor valido.");
			    }
			} while (type.get(i) <= 0 || type.get(i) > 3);
			
			do {
				System.out.println("Ingrese el valor del producto " + (i + 1) + ":");
				double costProduct = myScanner.nextDouble();
				cost.add(costProduct);
				totalCostProducts += costProduct;
				
			} while ( cost.get(i) < 0);
		}
		
		for (int i = 0; i < products ; i ++) {
			double discount = 0;
			
			if (type.get(i) == 1 ) {
				
				discount = DISCOUNT_CLOTHE * cost.get(i);
				cost.set(i, cost.get(i) - discount);
				totalWithDiscount += cost.get(i);
				
			} else if (type.get(i) == 2 ) {
				
				discount = DISCOUNT_TECH * cost.get(i);
				cost.set(i, cost.get(i) - discount);
				totalWithDiscount += cost.get(i);
				
			} else if (type.get(i) == 3 ) {
				
				discount = DISCOUNT_FEED * cost.get(i);
				cost.set(i, cost.get(i) - discount);
				totalWithDiscount += cost.get(i);
				
			}
			
		
		}
		
		if (totalWithDiscount > EXTRA_DISCOUNT ) {
			System.out.println("Has lacanzado un total de tu compra mayor a $500.000! \n"
					+         "Recibes un descuento de 25%!.");
			double extraDiscount = 0;
			
			extraDiscount = totalWithDiscount * 0.25;
			
			totalWithDiscount -= extraDiscount;
			
			
		}
		
		save = (double) totalCostProducts - totalWithDiscount;
		
		
		System.out.println("El costo total de tus productos es: " + (double)totalCostProducts);
		System.out.println("El costo total de sus productos con descuento es: " +  (double)totalWithDiscount);
		System.out.println("El ahorro total es: " + (double) save);
		
		
		System.out.println("Salir = 0 \n"
				+          "Repetir = 1");
		repeat = myScanner.nextInt();
		
		if (repeat == 0) {
			System.out.println("Gracias por su visita.");
			break;
		} else {
			 name.clear();
             type.clear();
             cost.clear();
             totalCostProducts = 0;
             totalWithDiscount = 0;
             save = 0;
		}
			//default:
				//System.out.println("Ingrese un valor valido");
				// break;
		
	} while ( repeat == 1);
	

	
	
	
	}

}
