package tabla_multiplicar;

public class tablaMultiplicar {

    public static void main(String[] args) {
        
        int fila = 0;
        
        // Encabezado
        System.out.print("|   |");
        int col = 0;
        while (col <= 10) {
            System.out.printf(" %3d |", col);
            col++;
        }
        System.out.println(); // Salto de línea

        // Filas
        while (fila <= 10) {
            System.out.printf("| %2d |", fila);
            
            col = 0; // Reiniciamos columna para cada fila
            while (col <= 10) {
                int r = fila * col;
                System.out.printf(" %3d |", r);
                col++;
            }
            System.out.println(); // Salto de línea al terminar la fila
            fila++;
        }
    }
}
