package practicaEjerciciosJava;

public class practicaContinueJava {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 3) {  
				continue;   
			}
			System.out.print(i + " ");  
		}
	}
}
