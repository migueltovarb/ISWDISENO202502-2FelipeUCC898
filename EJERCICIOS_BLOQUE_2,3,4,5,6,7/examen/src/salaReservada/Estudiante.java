package salaReservada;

import java.util.List;
import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String codigoInstitucional;
    private String programaAcademico;
    private List<Reserva> reservas;

    public Estudiante(String nombre, String codigoInstitucional, String programaAcademico) {
        this.nombre = nombre;
        this.codigoInstitucional = codigoInstitucional;
        this.programaAcademico = programaAcademico;
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoInstitucional() {
        return codigoInstitucional;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public String toString() {
        return nombre + " (" + codigoInstitucional + ")";
    }
}

