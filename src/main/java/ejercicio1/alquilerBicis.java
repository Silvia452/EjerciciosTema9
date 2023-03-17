package ejercicio1;

import java.util.Scanner;

public class alquilerBicis {
    public static void main(String[] args) {
        Bici[] bicis = new Bici[6];
        System.out.println("Bienvenido a la tienda de alquiler de bicicletas");
        System.out.println("Estas son las bicicletas disponibles: ");
        bicis[0] = new Bicicleta("Lapierre", "speed", new LocalDate(1, 1, 2019), 27);
        bicis[1] = new Segway("Ninebot", "One E+", new LocalDate(1, 1, 2019), 0, 0.5);
        bicis[4] = new Segway("Immotion", "v8", new LocalDate(1, 1, 2019), 40, 0);
        bicis[2] = new Giroscopio("Segway", "Nine", new LocalDate(1, 1, 2019), 40);
        bicis[5] = new Giroscopio("Weebot", "Echo", new LocalDate(1, 1, 2019), 35);
        bicis[3] = new Bicicleta("Btwin", "riverside", new LocalDate(1, 1, 2019), 10);

        for (Bici bici : bicis) {
            System.out.println(bici);
        }

        System.out.println("Seleccione que tipo de bicicleta desea alquilar: ");
        System.out.println("1. Bicicleta");
        System.out.println("2. Segway");
        System.out.println("3. Giroscopio");
        System.out.println("4. Salir");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("Ha seleccionado la bicicleta");
                System.out.println("Seleccione el modelo de bicicleta que desea alquilar:");
                System.out.println("1. Lapierre speed");
                System.out.println("2. Btwin Riverside");
                int option1 = sc.nextInt();
                switch(option1){
                    case 1:
                        System.out.println("Ha seleccionado la bicicleta Lapierre speed");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[0].getTarifaAlquilerHora() * horas + "€");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado la bicicleta Btwin Riverside");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas2 = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[3].getTarifaAlquilerHora() * horas2 + "€");
                        break;
                }

                break;

            case 2:
                System.out.println("Ha seleccionado el Segway");
                System.out.println("Seleccione el modelo de Segway que desea alquilar:");
                System.out.println("1. Ninebot One E+");
                System.out.println("2. Immotion v8");
                int option2 = sc.nextInt();
                switch(option2){
                    case 1:
                        System.out.println("Ha seleccionado el Segway Ninebot One E+");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[1].getTarifaAlquilerHora() * horas + "€");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado el Segway Immotion v8");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas2 = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[4].getTarifaAlquilerHora() * horas2 + "€");
                        break;
                }

                break;
            case 3:
                System.out.println("Ha seleccionado el Giroscopio");
                System.out.println("Seleccione el modelo de Giroscopio que desea alquilar:");
                System.out.println("1. Segway Nine");
                System.out.println("2. Weebot Echo");
                int option3 = sc.nextInt();
                switch(option3){
                    case 1:
                        System.out.println("Ha seleccionado el Giroscopio Segway Nine");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[2].getTarifaAlquilerHora() * horas + "€");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado el Giroscopio Weebot Echo");
                        System.out.println("Introduzca el número de horas que desea alquilar la bicicleta: ");
                        int horas2 = sc.nextInt();
                        System.out.println("El precio total a pagar es: " + bicis[5].getTarifaAlquilerHora() * horas2 + "€");
                        break;
                }
                break;
            case 4:
                System.out.println("Ha seleccionado salir");
                System.out.println("Gracias por utilizar nuestro servicio");
                break;
        }
    }
}
