package ejercicio1;

import java.time.LocalDateTime;

public class Segway extends Vehiculo{
    private double kilometros;
    private double alturaMin;

    public Segway(String marca, String modelo, LocalDateTime fechaCompra, double kilometros, double alturaMin) {
        super(marca, modelo, fechaCompra);
        this.kilometros = kilometros;
        this.alturaMin = alturaMin;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getAlturaMin() {
        return alturaMin;
    }

    public void setAlturaMin(double alturaMin) {
        this.alturaMin = alturaMin;
    }

    @Override
    public String toString() {
        return "Segway{" +
                "kilometros=" + kilometros +
                ", alturaMin=" + alturaMin +
                '}';
    }
}
