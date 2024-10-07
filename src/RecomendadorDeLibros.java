import java.util.Scanner;

public class RecomendadorDeLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu género de libro favorito? (fantasía, misterio, romance, ciencia ficción)");
        String genero = scanner.nextLine().toLowerCase();

        switch (genero) {
            case "fantasía":
                System.out.println("Te recomendamos 'Harry Potter' de J.K. Rowling.");
                break;
            case "misterio":
                System.out.println("Te recomendamos 'El Código Da Vinci' de Dan Brown");
                break;
            case "romance":
                System.out.println("Te recomendamos 'Orgullo y prejuicio' de Jane Austen.");
                break;
            case "ciencia ficcion":
                System.out.println("Te recomendamos 'Dune' de Frank Herbert.");
                break;
            default:
                System.out.println("Género no reconocido. Por favor, elige entre fantasía, misterio, romance o ciencia ficción.");
        }

        scanner.close();
    }
}
