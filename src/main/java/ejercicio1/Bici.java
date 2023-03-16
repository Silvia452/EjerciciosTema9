package ejercicio1;

public abstract class Bici {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public Bici(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
    public Bici(){

    }
    public abstract double getTarifaAlquilerHora();


    @Override
    public String toString() {
        return "Bici{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra + '\'' +
                getTarifaAlquilerHora()+ " €/hora"+
                '}';
    }
}
