package inventarioSuper;

import java.util.Scanner;

public class InventarioSuper {
	
	public static void main(String [] args) {
		
		Scanner myScanner = new Scanner(System.in);
		
		
		final int MAX_PRODUCTOS = 3;
		
		int productos = 0;
		
		double[] cantidadDisponible = new double[MAX_PRODUCTOS];	
		String [] nombres = new String[MAX_PRODUCTOS];
		
		int operacion = 0;
		
		for (int i = 0; i < MAX_PRODUCTOS; i++) {
			
			do {
				System.out.println("Ingrese el nombre del producto " + (i +1) + " :");
				nombres[i] = myScanner.nextLine();
				
				
				if (!nombres[i].matches("[a-zA-Z]+")) {
					System.out.println("Caracteres invalidos, ingrese el nombre nuevamente. ");
				}
				
			} while (!nombres[i].matches("[a-zA-Z]+"));	
	
		}
		
		for (int i = 0; i < MAX_PRODUCTOS; i++) {
			
			do {
				
				System.out.println("Ingrese la cantidad de el producto:  " + nombres[i]);
				cantidadDisponible[i] = myScanner.nextDouble();
				
				
				
				if (cantidadDisponible[i] < 0) {
					System.out.println("Error: Ingrese nuevamente la cantidad");
				}
			} while( cantidadDisponible[i] < 0);
			
		}
		
		
		do {	
			System.out.println("Bienvenido al inventario de tiendas D1 ingrese la operacion que desea realizar. \n"
						+          "1. Mostrar todos los productos y sus existencias. \n"
						+          "2. Buscar un producto por nombre y ver su cantidad. \n"
						+          "3. Actualizar el inventario (aumentar o disminuir stock con validaciones).\n"
						+          "4. Generar alerta de productos con cantidad menor a 10. \n"
						+          "5. Salir. ");
				
			operacion = myScanner.nextInt();
				
			myScanner.nextLine();
			
			switch (operacion) {
            case 1:
            	//mostrar todos los productos y sus existencias
                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                	System.out.println("La cantidad de existencias del producto " + nombres[i] + " es " + cantidadDisponible [i] );
                	
                }
                break;
                

            case 2:
                String productoBuscar = "";
                String productoEncontrado = "";
            	System.out.println("Ingrese el nombre del producto al que desea ver su cantidad.");
            	
            	productoBuscar = myScanner.nextLine();
            	
            	
            	for (int i = 0; i < MAX_PRODUCTOS; i++) {
            		
            		if (productoBuscar.equals(nombres[i])) {
            			productoEncontrado = nombres[i];
            			break;
            		} else {
            			System.out.println("Producto no encontrado");
            		}
            		
            	}
            	
            	for (int j = 0; j < MAX_PRODUCTOS; j++) {
            		if (productoEncontrado.equals(nombres[j])) {
            			
            			System.out.println("La cantidad de stock del producto " + nombres[j] + " es: " + cantidadDisponible[j]  );
            			
            		}
            	}
            	
            	break;
            	

            case 3:
                String productoActualizar = "";
                int sumaResta = 0;
                System.out.println("Ingrese el nombre del producto que desea actualizar");
                productoActualizar = myScanner.nextLine();

                for (int i = 0; i < MAX_PRODUCTOS; i++) {
                    if (productoActualizar.equals(nombres[i])) {
                        do {
                            System.out.println("Elija la operación que desea realizar: \n"
                                    + "1. Restar. \n"
                                    + "2. Sumar. ");
                            sumaResta = myScanner.nextInt();
                        } while (sumaResta != 1 && sumaResta != 2);

                        double cantidadResta = 0;
                        double cantidadSuma = 0;

                        if (sumaResta == 1) {
                            do {
                                System.out.println("Ingrese la cantidad que desea restar");
                                cantidadResta = myScanner.nextDouble();
                                if (cantidadResta > 0 && cantidadResta <= cantidadDisponible[i]) {
                                    cantidadDisponible[i] -= cantidadResta;
                                } else {
                                    System.out.println("No hay stock disponible o cantidad inválida");
                                }
                            } while (cantidadResta <= 0 || cantidadResta > cantidadDisponible[i]);
                            myScanner.nextLine();
                        } else if (sumaResta == 2) {
                            do {
                                System.out.println("Ingrese la cantidad que desea sumar");
                                cantidadSuma = myScanner.nextDouble();
                                if (cantidadSuma > 0) {
                                    cantidadDisponible[i] += cantidadSuma;
                                } else {
                                    System.out.println("Error: Ingrese una cantidad válida.");
                                }
                            } while (cantidadSuma <= 0);
                            myScanner.nextLine();
                        }
                        break;
                    }
                    if (i == MAX_PRODUCTOS - 1) {
                        System.out.println("Producto no encontrado.");
                    }
                }
                break;
                

            case 4:
            	for(int j = 0; j < MAX_PRODUCTOS; j++) {
            		
            		if (cantidadDisponible [j] < 10) {
            			
            			System.out.println("Alerta: El producto: " + nombres[j] + " tiene " + cantidadDisponible[j]);
            			
            		} else {
            			System.out.println("El producto: " + nombres[j] + " Tiene mas de 10 de stock.");
            		}
            		
            	}
            	
            	break;
            	
            case 5:
            	System.out.println("Gracias por su visita vuelva pronto.");
            	break;
            	
            default:
                System.out.println("Opción inválida, elige entre 1 y 5.");
                break;

            	
        }
			
	
		} while (operacion != 5);
		

	}

}
