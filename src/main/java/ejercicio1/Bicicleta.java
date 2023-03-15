package ejercicio1;

public abstract class Bicicleta extends Vehiculo{

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

    public double getTarifa(int velocidades) {
        if (velocidades==10 || velocidades==27){
            return 4.90;
        }
        return 4.90;

    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "claseMarchas=" + velocidades +
                '}';
    }
}
