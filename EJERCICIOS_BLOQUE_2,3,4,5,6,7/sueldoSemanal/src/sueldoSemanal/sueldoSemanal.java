package sueldoSemanal;
import java.util.Scanner;
public class sueldoSemanal {

	//Como trabajador,
	//Quiero calcular mi sueldo semanal en función de las horas trabajadas y el pago por hora,
	//Para saber cuánto recibiré al final de la semana.

	public static void main (String[] args) {
		float workingHours;
		Scanner myScanner = new Scanner(System.in);
		
		do {
			System.out.println("Ingresa la cantidad de horas trabajadas en la semana: ");
			workingHours = myScanner.nextFloat();
			
			if (workingHours <= 0) {
				System.out.println("Error: Ingrese un valor positivo.");
				
			}
		} while(workingHours <= 0 );
		float hourlyPay;

		do {
			System.out.println("Ingresa el pago por hora: ");
			hourlyPay = myScanner.nextFloat();
			
			if (hourlyPay <= 0) {
				System.out.println("Error: Ingrese un valor positivo.");
				
			}
		} while(hourlyPay <= 0 );
		
		float weeklySalary = hourlyPay * workingHours ;
		System.out.println("El sueldo total a recibir es: "+ weeklySalary);
		
		myScanner.close();

	}
}
