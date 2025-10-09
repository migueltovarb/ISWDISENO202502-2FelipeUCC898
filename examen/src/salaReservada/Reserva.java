package salaReservada;

public class Reserva {
    private Estudiante estudiante;
    private Sala salaReservada;
    private int fechaHora;

    public Reserva(Estudiante estudiante, Sala salaReservada, int fechaHora) {
        this.estudiante = estudiante;
        this.salaReservada = salaReservada;
        this.fechaHora = fechaHora;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Sala getSalaReservada() {
        return salaReservada;
    }

    public int getFechaHora() {
        return fechaHora;
    }

    public String toString() {
        return "Reserva de " + estudiante.toString() + " en " + salaReservada.getNumeroSala() + " para la hora " + fechaHora;
    }
}

