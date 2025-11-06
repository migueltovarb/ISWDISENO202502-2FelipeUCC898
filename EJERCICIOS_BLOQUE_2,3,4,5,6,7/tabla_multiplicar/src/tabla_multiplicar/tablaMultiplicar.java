package tabla_multiplicar;

public class tablaMultiplicar {

    public static void main(String[] args) {
        int i = 0;       // Contador
        int x = 0;       // Número de la tabla
        int v = 0;
        int r;   

        while (v < 1) {
            System.out.println("| 0 | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |\n");
            v++;
        }

        while (i <= 10) { // Paréntesis y sin punto y coma
            r = x * i;
            i++;
            System.out.println("| 0 | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " | " + r + " |\n");
            x++;
        }
    }
}
