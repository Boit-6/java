import java.util.Scanner;

public class CalculadoraIndiceFelicidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Califica tu nivel de satisfacción con la vida (1-10): ");
        double satisfaccion = scanner.nextDouble();

        System.out.println("Califica tu nivel de estrés (1-10): ");
        double estres = scanner.nextDouble();

        System.out.println("Califica tu nivel de salud (1-10): ");
        double salud = scanner.nextDouble();

        double indiceFelicidad = (satisfaccion + (10 - estres) + salud) / 3;
        System.out.printf("Tu índice de felicidad es: %.2f\n", indiceFelicidad);
        scanner.close();
    }
}
