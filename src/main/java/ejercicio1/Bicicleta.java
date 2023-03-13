package ejercicio1;

import java.time.LocalDateTime;

public class Bicicleta extends Vehiculo{

    private int claseMarchas;


    public Bicicleta(String marca, String modelo, LocalDateTime fechaCompra, int claseMarchas) {
        super(marca, modelo, fechaCompra);
        this.claseMarchas = claseMarchas;
    }

    public int getClaseMarchas() {
        return claseMarchas;
    }

    public void setClaseMarchas(int claseMarchas) {
        this.claseMarchas = claseMarchas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "claseMarchas=" + claseMarchas +
                '}';
    }
}
