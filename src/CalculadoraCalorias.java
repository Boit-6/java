import java.util.Scanner;

public class CalculadoraCalorias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la duración del ejercicio en minutos: ");
        double duracion = scanner.nextDouble();

        System.out.println("Introduce el tipo de ejercicio (correr, nadar, andar en bicicleta): ");
        String tipoEjercicio = scanner.next().toLowerCase();

        double caloriasPorMinuto = 0;

        switch (tipoEjercicio) {
            case "correr":
                caloriasPorMinuto = 10;
                break;
            case "nadar":
                caloriasPorMinuto = 8;
                break;
            case "andar en bicicleta":
                caloriasPorMinuto = 6;
                break;
            default:
                System.out.println("Tipo de ejercicio no reconocido.");
                scanner.close();
                return;
        }

        double caloriasQuemadas = peso * caloriasPorMinuto * duracion;
        System.out.printf("Calorías quemadas: %.2f\n", caloriasQuemadas);
        scanner.close();
    }
}
