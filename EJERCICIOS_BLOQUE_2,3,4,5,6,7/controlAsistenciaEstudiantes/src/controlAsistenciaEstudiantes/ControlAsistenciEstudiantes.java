package controlAsistenciaEstudiantes;

import java.util.Scanner;

public class ControlAsistenciEstudiantes {

	
	public static void main(String [] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		final int DIAS_SEMANAS = 5;
		final int NUM_ESTUDIANTES = 4;
		
		String [] P = new String[5];	
		String [] A = new String[5];
		String [] dias = { "lunes", "Martes", "Miércoles" , "Jueves" , "Viernes" };
		String [][] asistencia = new String[NUM_ESTUDIANTES][DIAS_SEMANAS];		
		
		String [] nombres = new String[4];
		
		int salir = 1;
		
		do {
			
			for (int i = 0; i < NUM_ESTUDIANTES; i++) {
				System.out.println("Ingrese el nombre del estudiante "+ (i+1) + ":");
				nombres[i] = myScanner.nextLine();	
			}
			
			for (int i = 0; i < DIAS_SEMANAS ; i++) {
				
				for (int j = 0; i < DIAS_SEMANAS; j++) {
					System.out.println("¿El estudiante/La estudiante " + nombres[i] + " Asistio el dia " + dias[j] + "?");
					asistencia[i][j] = myScanner.nextLine();	
				}
				
				
				
				
			
				
			}
			
			 
			
			
			
			
		} while (salir == 1);
		
		
		
		
	}
}
