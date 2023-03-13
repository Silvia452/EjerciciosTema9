package ejercicio1;

import java.time.LocalDateTime;

public class Giroscopio extends Vehiculo {
    private double kilometros;

    public Giroscopio(String marca, String modelo, LocalDateTime fechaCompra, double kilometros) {
        super(marca, modelo, fechaCompra);
        this.kilometros = kilometros;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "kilometros=" + kilometros +
                '}';
    }
}
