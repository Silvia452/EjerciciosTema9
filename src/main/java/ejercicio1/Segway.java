package ejercicio1;

public class Segway extends Bici {
    private double kilometros;
    private double alturaMin;

    public Segway(String marca, String modelo, LocalDate fechaCompra, double kilometros, double alturaMin) {
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

    public double getTarifaAlquilerHora() {
        return 18.90;
    }

    @Override
    public String toString() {
        return "Segway{" +
                "kilometros=" + kilometros +
                ", alturaMin=" + alturaMin +
                '}';
    }
}
