package invoiceItem;

import java.util.Scanner;

public class programa {
	
	public static void main (String [] args) {
		
		InvoiceItem myInvoiceItem = new InvoiceItem("usuario", "quinientos", 52, 45);
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println(myInvoiceItem);
		
		System.out.println("Ingrese un nuevo Qty: ");
		
		int newQty = myScanner.nextInt();
		
		myInvoiceItem.setQty(newQty);
		
		System.out.println(myInvoiceItem.getQty());
		
		System.out.println("Ingrese un nuevo UnitPrice: ");
		
		double newUnitPrice = myScanner.nextDouble();
		
		myInvoiceItem.setUnitePrice(newUnitPrice);
		
		System.out.println(myInvoiceItem.getUnitPrice());
		
		System.out.println(myInvoiceItem);
		
		System.out.println(myInvoiceItem.getID());
		System.out.println(myInvoiceItem.getDesc());
		System.out.println(myInvoiceItem.getQty());
		System.out.println(myInvoiceItem.getUnitPrice());
		
		
		
		
	}

}
