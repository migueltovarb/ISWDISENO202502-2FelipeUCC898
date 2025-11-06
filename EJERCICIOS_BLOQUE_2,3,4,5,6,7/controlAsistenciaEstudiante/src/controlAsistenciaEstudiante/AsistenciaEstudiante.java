package controlAsistenciaEstudiante;

import java.util.Scanner;

public class AsistenciaEstudiante {
	
	public static void main (String[] args) {
		
		
		Scanner myScanner = new Scanner(System.in);
		
		final int DIAS_SEMANAS = 5;
		final int NUM_ESTUDIANTES = 4;
		
		String[][] asistencia = new String[NUM_ESTUDIANTES][DIAS_SEMANAS];
		String [] dias = {"Lunes", "Martes" , "Miercoles" , "Jueves" , "Viernes"};
		
		String [] nombres = new String[NUM_ESTUDIANTES];
		
		
		
		int salir = 1;
		
		do {
			
			for (int i = 0; i < NUM_ESTUDIANTES; i++) {
				
				do {
					System.out.println("Ingrese el nombre del estudiante " + (i+1) + " :");
					nombres[i] = myScanner.nextLine();
					
					if (!nombres[i].matches("[a-zA-Z]+")) {
						System.out.println("Caracteres invalidos, ingrese el nombre nuevamente. ");
					}
					
				} while (!nombres[i].matches("[a-zA-Z]+"));
				
			}
			
			 for (int i = 0; i < NUM_ESTUDIANTES; i++) {
	                
	                for (int j = 0; j < DIAS_SEMANAS; j++) {
	                    
	                    do {
	                        System.out.println("¿El estudiante/ La estudiante " + nombres[i] + " faltó el día " + dias[j] + " ? A = SI, P = No");
	                        asistencia[i][j] = myScanner.nextLine().toUpperCase(); 
	                        
	                        if (!asistencia[i][j].equals("A") && !asistencia[i][j].equals("P")) {
	                            System.out.println("Ingrese un valor válido. Solo 'A' o 'P'.");
	                        }
	                        
	                    } while (!asistencia[i][j].equals("A") && !asistencia[i][j].equals("P"));
	                    
	                }
	                
	            }
			
			for (int i = 0; i < NUM_ESTUDIANTES; i++) {
				
				int asistio = 0;
				
				for (int j = 0; j < DIAS_SEMANAS; j++) {
					if (asistencia[i][j].equals("P")) {
						
						asistio ++;
					}
					
				}
				
				System.out.println("El total de asistencias de " + nombres[i] + " es: " + asistio + " dias.");
			}
			
			for (int i = 0; i < NUM_ESTUDIANTES; i++) {
				System.out.println("Los estudiantes que asistieron todos los dias son: ");
				
				
				for(int j = 0; j < DIAS_SEMANAS; j++ ) {
					
					if (asistencia[i][j].equals("P")) {
						
						
						
					}
					
				}
			}
			
			
			 
			
			
		} while (salir == 1);
		
	}
}
