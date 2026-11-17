import java.util.Scanner;

public class FechaDelDia {

    static Scanner teclado = new Scanner(System.in);

    // Lee un año válido
    public static int LeeAnioValido() {
        int a;

        do {
            System.out.println("Introduce un año (desde 1583):");
            a = teclado.nextInt();

            if (a < 1583) {
                System.out.println("Año no válido.");
            }

        } while (a < 1583);

        return a;
    }

    // Lee un mes válido
    public static int LeeMesValido(int a) {
        int m;

        do {
            System.out.println("Introduce un mes (1-12):");
            m = teclado.nextInt();

            if (m < 1 || m > 12) {
                System.out.println("Mes no válido.");
            }

        } while (m < 1 || m > 12);

        return m;
    }

    // Comprueba si un año es bisiesto
    public static boolean Bisiesto(int a) {
        return (a % 4 == 0 && a % 100 != 0) || (a % 400 == 0);
    }

    // Lee un día válido según el mes y el año
    public static int LeeDiaValido(int a, int m) {
        int d;
        int maxDias;

        if (m == 2) {
            if (Bisiesto(a)) {
                maxDias = 29;
            } else {
                maxDias = 28;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxDias = 30;
        } else {
            maxDias = 31;
        }

        do {
            System.out.println("Introduce el día:");
            d = teclado.nextInt();

            if (d < 1 || d > maxDias) {
                System.out.println("Día no válido.");
            }

        } while (d < 1 || d > maxDias);

        return d;
    }

    // Calcula el día de la semana
    public static int DiaSemana(int d, int m, int a) {
        int mes, b, c, n;

        if (m == 1 || m == 2) {
            mes = m + 10;
            b = (a - 1) % 100;
            c = (a - 1) / 100;
        } else {
            mes = m - 2;
            b = a % 100;
            c = a / 100;
        }

        n = (700 + (26 * mes - 2) / 10 + d + b + b / 4
                + c / 4 - 2 * c) % 7;

        return n;
    }

    // Devuelve el nombre del día
    public static String DiaEnLetra(int nDia) {
        String[] dias = {
            "Domingo", "Lunes", "Martes", "Miércoles",
            "Jueves", "Viernes", "Sábado"
        };

        return dias[nDia];
    }

    public static void main(String[] args) {

        int a, m, d, n;

        a = LeeAnioValido();
        m = LeeMesValido(a);
        d = LeeDiaValido(a, m);

        n = DiaSemana(d, m, a);

        System.out.println("La fecha " + d + "/" + m + "/" + a
                + " corresponde a un " + DiaEnLetra(n));

        teclado.close();
    }
}
