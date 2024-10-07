import java.util.Scanner;

public class GeneradorDeHoroscopo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = scanner.nextLine();
        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = "";
        String mensaje = "";

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            mensaje = "Hoy es un buen día para comenzar nuevos proyectos.";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            mensaje = "La paciencia será clave para tus éxitos.";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            mensaje = "Comunicación y creatividad estarán a la orden del día.";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            mensaje = "Debes prestar atención a tus emociones.";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            mensaje = "Tu energía atraerá a los demás.";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            mensaje = "Es un buen momento para organizar tus ideas.";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            mensaje = "La armonía en tus relaciones será fundamental.";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            mensaje = "Tu intuición estará potenciada.";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            mensaje = "Es momento de explorar nuevas posibilidades.";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
            mensaje = "Temas de trabajo serán destacados hoy.";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            mensaje = "La originalidad te brindará oportunidades.";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            mensaje = "La creatividad será tu mejor aliada.";
        }

        System.out.println("Tu signo es: " + signo);
        System.out.println("Horóscopo: " + mensaje);
        scanner.close();
    }
}
