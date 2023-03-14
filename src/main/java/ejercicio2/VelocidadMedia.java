package ejercicio2;

import java.util.Scanner;

public class VelocidadMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un idioma / Select a language:");
        System.out.println("1. Español");
        System.out.println("2. English");

        int idiomaSeleccionado = scanner.nextInt();


        // Seleccionar la clase de traducción apropiada según el idioma seleccionado
        Traduccion traduccion;
        switch (idiomaSeleccionado) {
            case 1:
                traduccion = new TraduccionES();
                break;
            case 2:
                traduccion = new TraduccionEN();
                break;
            default:
                System.out.println("Idioma no válido / Invalid language");
                return;
        }

        // Pedir al usuario que introduzca la distancia recorrida y el tiempo de recorrido
        traduccion.introducirDistancia();
        double distancia = scanner.nextDouble();

        traduccion.introducirTiempo();
        double tiempo = scanner.nextDouble();

        // Calcular la velocidad media y mostrar el resultado en el idioma seleccionado
        double velocidadMedia = distancia / (tiempo / 60.0);
        traduccion.inicioRespuesta();
        traduccion.finRespuesta(velocidadMedia);
    }
}



