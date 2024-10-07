import java.util.Scanner;

public class GeneradorPlanesEstudio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántas horas al día puedes estudiar?");
        double horasDiarias = scanner.nextDouble();

        System.out.println("Introduce las materias que quieres estudiar (separadas por comas): ");
        scanner.nextLine(); // Limpiar el buffer
        String materiasInput = scanner.nextLine();
        String[] materias = materiasInput.split(",");

        int numMaterias = materias.length;
        double horasPorMateria = horasDiarias / numMaterias;

        System.out.println("\nTu plan de estudio semanal es:");
        for (int dia = 1; dia <= 7; dia++) {
            System.out.printf("Día %d:\n", dia);
            for (String materia : materias) {
                System.out.printf("- %.2f horas de %s\n", horasPorMateria, materia.trim());
            }
        }

        scanner.close();
    }
}
