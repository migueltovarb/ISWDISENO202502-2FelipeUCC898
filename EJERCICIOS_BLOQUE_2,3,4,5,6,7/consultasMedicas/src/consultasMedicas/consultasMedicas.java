package consultasMedicas;

import java.util.Scanner;
public class consultasMedicas {
	
	public static void main (String[] args ) {
		Scanner myScanner = new Scanner(System.in);
		int appointment;
		do {
			System.out.println("Ingrese su número de cita actual de paciente: ");
			appointment = myScanner.nextInt();
			
			if (appointment < 1) {
			    System.out.println("Error: Ingrese un valor mayor o igual a 1.");
			}
			} while (appointment < 1);

		
		double costPerAppointment = 0;
		
		if (appointment <= 3 ) {
			System.out.println("El costo de su cita es de $200.000 c/u.");
			costPerAppointment = 200000;
		} else if (appointment > 3 && appointment <= 5 ) {
			System.out.println("El costo de su cita es de $150.000 c/u.");
			costPerAppointment = 150000;
		} else if (appointment > 5 && appointment <= 8 ) {
			System.out.println("El costo de su cita es de $100.000 c/u");
			costPerAppointment = 100000;
		} else {
			System.out.println("El costo de cita es de $50.000 c/u");
			costPerAppointment = 50000;
		}
		double totalPaid = 0;
		for (int i = 1; i <= appointment; i++) {
			if (i <= 3) {
				totalPaid += 200000;
			} else if (i >3 && i <=5) {
				totalPaid += 150000;
			} else if (i > 5 && i <= 8) {
				totalPaid += 100000;
			} else {
				totalPaid += 50000;
			}
			
		}
		
		System.out.println("El total pagado sumando los costos de todas las citas anteriores es: " + totalPaid);
	}
}
