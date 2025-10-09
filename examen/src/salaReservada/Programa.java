package salaReservada;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Biblioteca biblioteca = new Biblioteca();
        
        // Crear salas para la biblioteca
        Sala sala1 = new Sala(1, 30, Disponible.SI);
        Sala sala2 = new Sala(2, 20, Disponible.NO);
        Sala sala3 = new Sala(3, 25, Disponible.SI);
        
        biblioteca.agregarSala(sala1);
        biblioteca.agregarSala(sala2);
        biblioteca.agregarSala(sala3);
        
        // Pedir datos del estudiante
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su código institucional: ");
        String codigoInstitucional = scanner.nextLine();
        
        System.out.print("Ingrese su programa académico: ");
        String programaAcademico = scanner.nextLine();
        
        Estudiante estudiante = new Estudiante(nombre, codigoInstitucional, programaAcademico);
        
        // Mostrar salas disponibles
        System.out.println("\nSalas disponibles:");
        biblioteca.mostrarSalasDisponibles();
        
        // Seleccionar una sala para reservar
        System.out.print("\nSeleccione el número de la sala para reservar: ");
        int numeroSala = scanner.nextInt();
        
        Sala salaSeleccionada = null;
        for (Sala sala : biblioteca.getSalas()) {
            if (sala.getNumeroSala() == numeroSala && sala.getDisponibilidad() == Disponible.SI) {
                salaSeleccionada = sala;
                break;
            }
        }
        
        if (salaSeleccionada != null) {
            System.out.print("Ingrese la hora para la reserva (en formato de 24 horas): ");
            int fechaHora = scanner.nextInt();
            
            // Crear la reserva
            Reserva reserva = new Reserva(estudiante, salaSeleccionada, fechaHora);
            estudiante.registrarReserva(reserva);
            salaSeleccionada.setDisponibilidad(Disponible.NO); // Actualizar disponibilidad de la sala
            
            System.out.println("\nReserva realizada con éxito:");
            System.out.println(reserva);
        } else {
            System.out.println("\nLa sala seleccionada no está disponible.");
        }
        
        // Mostrar salas disponibles después de la reserva
        System.out.println("\nSalas disponibles después de la reserva:");
        biblioteca.mostrarSalasDisponibles();
        
        scanner.close();
    }
}

