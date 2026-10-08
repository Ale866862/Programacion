import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el día de nacimiento: ");
        int dia = teclado.nextInt();

        System.out.print("Introduce el mes de nacimiento (1-12): ");
        int mes = teclado.nextInt();

        // Comprobar que el mes sea válido
        if (mes < 1 || mes > 12) {
            System.out.println("Fecha no válida");
        } else {
            // Comprobar que el día sea válido según el mes
            int maxDias;

            if (mes == 2) {
                maxDias = 28;
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                maxDias = 30;
            } else {
                maxDias = 31;
            }

            if (dia < 1 || dia > maxDias) {
                System.out.println("Fecha no válida");
            } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
                System.out.println("Tu signo es Aries");
            } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
                System.out.println("Tu signo es Tauro");
            } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
                System.out.println("Tu signo es Géminis");
            } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
                System.out.println("Tu signo es Cáncer");
            } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
                System.out.println("Tu signo es Leo");
            } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
                System.out.println("Tu signo es Virgo");
            } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
                System.out.println("Tu signo es Libra");
            } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
                System.out.println("Tu signo es Escorpio");
            } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
                System.out.println("Tu signo es Sagitario");
            } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
                System.out.println("Tu signo es Capricornio");
            } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
                System.out.println("Tu signo es Acuario");
            } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
                System.out.println("Tu signo es Piscis");
            }

        }

        teclado.close();
    }
}
