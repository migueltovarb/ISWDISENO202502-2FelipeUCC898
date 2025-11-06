package cajeroAutomaticoPOO;

public class Cajero {
    private double saldo;
    public static final double SALDO_INICIAL = 1000;

    public Cajero() {
        this.saldo = SALDO_INICIAL;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }
}
