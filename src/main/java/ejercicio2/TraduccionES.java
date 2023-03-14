package ejercicio2;

public class TraduccionES implements Traduccion{

    @Override
    public void introducirDistancia() {
        System.out.println("Introduzca la distancia en metros: ");
    }

    @Override
    public void introducirTiempo() {
        System.out.println("Introduzca el tiempo del recorrido(min): ");
    }

    @Override
    public void inicioRespuesta() {
        System.out.print("Se ha desplazado a una velocidad de ");
    }

    @Override
    public void finRespuesta(double velocidad) {
        System.out.printf("%.1f km/h.%n", velocidad);
    }
}
