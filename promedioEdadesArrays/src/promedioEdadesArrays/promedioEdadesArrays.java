package promedioEdadesArrays;

import java.util.Scanner;

public class promedioEdadesArrays {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de alumnos: ");
        int students = myScanner.nextInt();

        if (students <= 0) {
            System.out.println("Ingrese un valor mayor a 0.");
            return;
        }

        int[] ages = new int[students];

        // Leer las edades
        for (int i = 0; i < students; i++) {
            int age = 0;
            do {
                System.out.println("Ingrese la edad del estudiante " + (i + 1) + ": ");
                age = myScanner.nextInt();

                if (age <= 0) {
                    System.out.println("Error: la edad debe ser mayor que 0.");
                }
            } while (age <= 0);

            ages[i] = age;
        }

        // Calcular suma, min y max
        int addition = 0;
        int min = ages[0];
        int max = ages[0];

        for (int age : ages) {
            addition += age;
            if (age < min) min = age;
            if (age > max) max = age;
        }

        double average = (double) addition / students;

        // Resultados
        System.out.println("\n📊 Resultados:");
        System.out.println("Promedio de edades: " + average);
        System.out.println("Edad mínima: " + min);
        System.out.println("Edad máxima: " + max);

        myScanner.close();
    }
}
