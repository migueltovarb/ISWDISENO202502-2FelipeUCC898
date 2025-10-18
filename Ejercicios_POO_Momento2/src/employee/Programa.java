package employee;

import java.util.Scanner;

public class Programa {
	
	public static void main (String [] args) {
		
		Employee myEmployee = new Employee(908404, "DAVID", "DEWY", 3800000);
		
		System.out.println(myEmployee);
		
		//pedir ingresar nuevo salario
		
		System.out.println("Ingrese el nuevo salario del empleado: ");
		
		Scanner myScanner = new Scanner(System.in);
		
		int newSalary = myScanner.nextInt();
		
		//Establecer el nuevo aumento
		
		myEmployee.setSalary(newSalary);
		
		System.out.println(myEmployee);
		
		//Pedir al usuario el procentaje de aumento
		
		System.out.println("Ingrese el porcentaje de aumento del empleado: ");
		
		int increase = myScanner.nextInt();
		
		//Aplicar el aumento de salario
		
		myEmployee.raiseSalary(increase);
		
		//mostrar el salario anual y otros detalles
		
		System.out.println("El salario anual de su empleado es: " + myEmployee.getAnnualSalary() + " ");
		
		System.out.println("El nombre del empleado es: " + myEmployee.getFirstName());
		
		System.out.println("El apellido del empleado es: " + myEmployee.getLastName());
		
		System.out.println("El aumento al salario fue de: " + myEmployee.increase(increase));
		
		
		myScanner.close();
		
		
	}

}
