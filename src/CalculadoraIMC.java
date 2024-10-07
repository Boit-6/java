import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Tu Índice de Masa Corporal (IMC) es: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Recomendación: Estás en bajo peso. Considera consultar a un profesional de la salud.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Recomendación: Tienes un peso normal. ¡Sigue así!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Recomendación: Estás en sobrepeso. Considera hacer ajustes en tu dieta y actividad física.");
        } else {
            System.out.println("Recomendación: Estás en obesidad. Es recomendable consultar a un profesional de la salud.");
        }

        scanner.close();
    }
}
