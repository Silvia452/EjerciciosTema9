package ejercicio2;

public class TraduccionEN implements Traduccion{

        @Override
        public void introducirDistancia() {
            System.out.println("Enter the distance travelled in meters: ");
        }

        @Override
        public void introducirTiempo() {
            System.out.println("Enter the time of the trip(min): ");
        }

        @Override
        public void inicioRespuesta() {
            System.out.print("You have moved at a speed of ");
        }

        @Override
        public void finRespuesta(double velocidad) {
            System.out.printf("%.1f km/h.%n", velocidad);
        }
}
