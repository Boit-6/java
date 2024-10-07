import java.util.Scanner;

public class EvaluadorHabitosSaludables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas horas duermes al día?");
        int horasDormir = scanner.nextInt();

        System.out.println("¿Cuántas horas haces ejercicio al día?");
        int horasEjercicio = scanner.nextInt();

        System.out.println("¿Cuántas comidas saludables consumes al día?");
        int comidasSaludables = scanner.nextInt();

        String evaluacion;

        if (horasDormir < 7) {
            evaluacion = "Debes tratar de dormir más horas.";
        } else if (horasEjercicio < 1) {
            evaluacion = "Incorpora más ejercicio a tu rutina.";
        } else if (comidasSaludables < 3) {
            evaluacion = "Asegúrate de comer más alimentos saludables.";
        } else {
            evaluacion = "¡Estás llevando un estilo de vida saludable!";
        }

        System.out.println(evaluacion);
        scanner.close();
    }
}
