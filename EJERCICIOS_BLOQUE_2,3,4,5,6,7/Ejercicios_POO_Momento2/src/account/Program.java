package account;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        
        // Crear dos cuentas con diferentes saldos
        Account myAccount1 = new Account("123", "John Doe", 5000);
        Account myAccount2 = new Account("324", "Jane Doe", 3000);
        
        // Mostrar las cuentas iniciales
        System.out.println(myAccount1);
        System.out.println(myAccount2);
        
        // Crear una instancia de Scanner para leer entradas del usuario
        Scanner myScanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese el monto para agregar a la cuenta N#1
        System.out.println("Ingrese el monto que desea agregar a su cuenta N#1: ");
        int amount = myScanner.nextInt();
        myAccount1.credit(amount);  // Agregar monto a la cuenta N#1
        
        // Pedir al usuario que ingrese el monto para agregar a la cuenta N#2
        System.out.println("Ingrese el monto que desea agregar a su cuenta N#2: ");
        int amount2 = myScanner.nextInt();
        myAccount2.credit(amount2);  // Agregar monto a la cuenta N#2
        
        // Mostrar las cuentas después de los créditos
        System.out.println(myAccount1);
        System.out.println(myAccount2);
        
        // Pedir al usuario que ingrese el monto a sustraer de la cuenta N#1
        System.out.println("Sustraer el monto de la cuenta N#1: ");
        int debit = myScanner.nextInt();
        myAccount1.debit(debit);  // Restar monto de la cuenta N#1
        
        // Mostrar el saldo de la cuenta N#1
        System.out.println("Saldo de la cuenta N#1 después del débito: " + myAccount1.getBalance());
        
        // Pedir al usuario que ingrese el monto a sustraer de la cuenta N#2
        System.out.println("Sustraer el monto de la cuenta N#2: ");
        int debit2 = myScanner.nextInt();
        myAccount2.debit(debit2);  // Restar monto de la cuenta N#2
        
        // Mostrar el saldo de la cuenta N#2
        System.out.println("Saldo de la cuenta N#2 después del débito: " + myAccount2.getBalance());
        
        // Pedir al usuario que ingrese el monto a transferir de la cuenta N#1 a N#2
        System.out.println("Añadir el monto que deseas transferir de tu cuenta N#1 a N#2: ");
        int amountToTransfer = myScanner.nextInt();
        myAccount1.transferTo(myAccount2, amountToTransfer);  // Transferir monto de N#1 a N#2
        
        // Mostrar el saldo de la cuenta N#2 después de la transferencia
        System.out.println("Saldo de la cuenta N#2 después de la transferencia: " + myAccount2.getBalance());
        
        // Mostrar la representación de la cuenta N#1
        System.out.println(myAccount1.toString());
        
        // Cerrar el scanner
        myScanner.close();
    }
}
