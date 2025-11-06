package salaReservada;


public class Sala {
    private int numeroSala;
    private int capacidadMaxima;
    private Disponible disponibilidad;

    public Sala(int numeroSala, int capacidadMaxima, Disponible disponibilidad) {
        this.numeroSala = numeroSala;
        this.capacidadMaxima = capacidadMaxima;
        this.disponibilidad = disponibilidad;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Disponible getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponible disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String toString() {
        return "Sala " + numeroSala + " (Capacidad: " + capacidadMaxima + ", Disponible: " + disponibilidad + ")";
    }
}
