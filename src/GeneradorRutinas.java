import java.util.Scanner;

public class GeneradorRutinas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.nextLine().toLowerCase();

        String rutina = "";

        switch (nivel) {
            case "principiante":
                rutina = "Lunes: 30 minutos de caminata\nMartes: 15 minutos de estiramientos\nMiércoles: 20 minutos de bicicleta\nJueves: Descanso\nViernes: 30 minutos de caminata\nSábado: 15 minutos de yoga\nDomingo: Descanso";
                break;
            case "intermedio":
                rutina = "Lunes: 30 minutos de jogging\nMartes: 25 minutos de bicicleta\nMiércoles: 20 minutos de entrenamiento de fuerza\nJueves: Descanso\nViernes: 40 minutos de natación\nSábado: 30 minutos de yoga\nDomingo: Descanso";
                break;
            case "avanzado":
                rutina = "Lunes: 1 hora de carrera\nMartes: 45 minutos de ciclismo\nMiércoles: 1 hora de entrenamiento de fuerza\nJueves: 30 minutos de HIIT\nViernes: 45 minutos de natación\nSábado: 1 hora de yoga\nDomingo: Descanso";
                break;
            default:
                System.out.println("Nivel no reconocido.");
                scanner.close();
                return;
        }

        System.out.println("Tu rutina de ejercicio semanal es:\n" + rutina);
        scanner.close();
    }
}
