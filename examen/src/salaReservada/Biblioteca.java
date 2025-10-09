package salaReservada;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private List<Sala> salas;

    public Biblioteca() {
        salas = new ArrayList<>();
    }

    public void agregarSala(Sala sala) {
        salas.add(sala);
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void mostrarSalasDisponibles() {
        for (Sala sala : salas) {
            if (sala.getDisponibilidad() == Disponible.SI) {
                System.out.println(sala);
            }
        }
    }
}

