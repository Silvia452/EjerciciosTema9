package ejercicio1;

public class Bicicleta extends Bici {

    private int velocidades;


    public Bicicleta(String marca, String modelo, LocalDate fechaCompra, int velocidades) {
        super(marca, modelo, fechaCompra);
        this.velocidades = velocidades;
    }

    public int getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(int velocidades) {
        this.velocidades = velocidades;
    }

    public double getTarifaAlquilerHora() {
        return 4.90;

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "velocidades=" + velocidades +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
