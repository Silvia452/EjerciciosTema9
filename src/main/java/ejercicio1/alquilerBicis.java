package ejercicio1;

public class alquilerBicis {
    public static void main(String[] args) {
        Bici[] bicis = new Bici[4];
        bicis[0] = new Bicicleta("BH", "G6", new LocalDate(1, 1, 2019), 21);
        bicis[1] = new Segway("Segway", "X2", new LocalDate(1, 1, 2019), 0, 1.5);
        bicis[2] = new Giroscopio("Giroscopio", "X2", new LocalDate(1, 1, 2019), 0);
        bicis[3] = new Bicicleta("BH", "G6", new LocalDate(1, 1, 2019), 21);

        for (Bici bici : bicis) {
            System.out.println(bici);
        }
    }
}
