import java.util.Scanner;

public class RecomendadorDePeliculas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu género de película favorito? (acción, comedia, drama, ciencia ficción)");
        String genero = scanner.nextLine().toLowerCase();

        switch (genero) {
            case "accion":
                System.out.println("Te recomendamos 'Batman'.");
                break;
            case "comedia":
                System.out.println("Te recomendamos 'Son como niños'.");
                break;
            case "drama":
                System.out.println("Te recomendamos 'Romper el circulo'.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos 'Volver al futuro'.");
                break;
            default:
                System.out.println("Género no reconocido. Por favor, elige entre acción, comedia, drama o ciencia ficción.");
        }

        scanner.close();
    }
}
