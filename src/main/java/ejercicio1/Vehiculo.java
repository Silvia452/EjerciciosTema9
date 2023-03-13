package ejercicio1;

import java.time.LocalDateTime;

public class Vehiculo {
    private String marca;
    private String modelo;
    private LocalDateTime fechaCompra;

    public Vehiculo(String marca, String modelo, LocalDateTime fechaCompra) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
    }
    public Vehiculo(){

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechaCompra=" + fechaCompra +
                '}';
    }
}
