package ejercicio1;

import java.time.LocalDateTime;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected LocalDate fechaCompra;

    public Vehiculo(String marca, String modelo, LocalDate fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
    public Vehiculo(){

    }
    public abstract double getTarifa();


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra + '\'' +
                getTarifa()+ " €/hora"+
                '}';
    }
}
