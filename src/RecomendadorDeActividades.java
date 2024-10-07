import java.util.Scanner;

public class RecomendadorDeActividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado)");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Te recomendamos hacer una actividad al aire libre.");
                break;
            case "triste":
                System.out.println("Te recomendamos ver a un psicologo.");
                break;
            case "enérgico":
                System.out.println("Te recomendamos hacer algun ejercicio.");
                break;
            case "relajado":
                System.out.println("Te recomendamos leer un libro.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Por favor, elige entre feliz, triste, enérgico o relajado.");
        }

        scanner.close();
    }
}
