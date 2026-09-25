import java.util.Scanner;

public class SegundosAMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int segundos;
        int minutos;
        int restoSegundos;
        int horas;
        System.out.print("Introduce el número de segundos: ");
        segundos = sc.nextInt();
        // Pasamos los segundos a minutos
        minutos = segundos / 60;
        // Guardamos los segundos que sobran
        restoSegundos = segundos % 60;
        // Pasamos los minutos a horas
        horas = minutos / 60;
        // Nos quedamos con los minutos que sobran después de sacar las horas
        minutos = minutos % 60;
        if (horas > 0) {
            System.out.println(horas + " horas, " + minutos + " minutos y " + restoSegundos + " segundos.");
        } else {
            System.out.println(minutos + " minutos y " + restoSegundos + " segundos.");
        }

        sc.close();
    }
}
