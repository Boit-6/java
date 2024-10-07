import java.util.Scanner;

public class GeneradorDeListas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase();

        String listaDeReproduccion = "";

        switch (estadoAnimo) {
            case "feliz":
                listaDeReproduccion = "1. 'Happy' - Pharrell Williams\n2. 'Uptown Funk' - Mark Ronson\n3. 'Shut Up and Dance' - Walk the Moon";
                break;
            case "triste":
                listaDeReproduccion = "1. 'Someone Like You' - Adele\n2. 'Fix You' - Coldplay\n3. 'The Night We Met' - Lord Huron";
                break;
            case "enérgico":
                listaDeReproduccion = "1. 'Titanium' - David Guetta\n2. 'Eye of the Tiger' - Survivor\n3. 'Can’t Stop the Feeling' - Justin Timberlake";
                break;
            case "relajado":
                listaDeReproduccion = "1. 'Weightless' - Marconi Union\n2. 'River Flows in You' - Yiruma\n3. 'Budapest' - George Ezra";
                break;
            default:
                System.out.println("Estado de ánimo no reconocido.");
                scanner.close();
                return;
        }

        System.out.println("Tu lista de reproducción es:\n" + listaDeReproduccion);
        scanner.close();
    }
}
