package author;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Crear un objeto Author, ahora con el género como char ('M')
        Author myAuthor = new Author("Juan", "felipe.nago89u@gmail.com", 'M');
        
        // Mostrar la representación del autor
        System.out.println(myAuthor.toString());
        
        // Pedir un nuevo email al usuario
        System.out.println("Ingrese un email nuevo: ");
        Scanner myScanner = new Scanner(System.in);
        
        // Leer el nuevo email
        String newEmail = myScanner.nextLine();
        
        // Establecer el nuevo email en el objeto Author
        myAuthor.setEmail(newEmail);
        
        // Mostrar los detalles del autor
        System.out.println("Nuevo email: " + myAuthor.getEmail());
        System.out.println("Nombre del autor: " + myAuthor.getName());
        System.out.println("Género del autor: " + myAuthor.getGender());
        
        // Mostrar la representación final del autor
        System.out.println(myAuthor.toString());
        
        // Cerrar el scanner para liberar recursos
        myScanner.close();
    }
}
