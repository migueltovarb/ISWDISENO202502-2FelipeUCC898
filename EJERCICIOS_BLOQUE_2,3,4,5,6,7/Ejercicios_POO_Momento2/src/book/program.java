package book;

import java.util.Scanner;
import author.Author;

public class program {
	
	public static void main(String[] args) {
		
		Author author = new Author("Gabriel Garcia Marquez", "gabriel@literature.com", 'M');
		
		Book book = new Book("Cien años de soledad", author, 39.99, 10);
		
		 // Mostrar los detalles del libro
        System.out.println(book.toString());
        
        // Cambiar el precio del libro
        book.setPrice(29.99);
        System.out.println("Nuevo precio: " + book.getPrice());
        
        // Cambiar la cantidad de libros disponibles
        book.setQty(5);
        System.out.println("Cantidad actual: " + book.getQty());
        
        // Mostrar nuevamente el libro con los cambios
        System.out.println(book.toString());
    }
}
