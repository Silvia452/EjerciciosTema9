package ejercicio1;

import java.time.LocalDateTime;

public class Giroscopio extends Vehiculo {
    private double kilometros;

    public Giroscopio(String marca, String modelo, LocalDate fechaCompra, double kilometros) {
        super(marca, modelo, fechaCompra);
        this.kilometros = kilometros;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getTarifa() {
        return 29.90;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "kilometros=" + kilometros +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
