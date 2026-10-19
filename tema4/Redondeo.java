import java.util.Scanner;

public class Redondeo {
    //1.       Introduce 5 notas desde teclado y muestra para cada nota, la nota redondeada con un decimal al alza, a la baja,
    //  la nota truncada en las unidades y al final muestra la media e indica el máximo y mínimo.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;
        double maximo = Double.MIN_VALUE;
        double minimo = Double.MAX_VALUE;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            while (notas[i] > 10) {
                System.out.println("La nota no puede ser mayor que 10. Inténtalo de nuevo.");
                System.out.print("Introduce la nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }
            suma += notas[i];

            if (notas[i] > maximo) {
                maximo = notas[i];
        }
            if (notas[i] < minimo) {
                minimo = notas[i];
        }

            // Redondeo al alza
            double redondeoAlAlza = Math.ceil(notas[i] * 10) / 10.0;
            // Redondeo a la baja
            double redondeoABaja = Math.floor(notas[i] * 10) / 10.0;
            // Truncado en las unidades
            int truncadoUnidades = (int) notas[i];

            System.out.println("Nota original: " + notas[i]);
            System.out.println("Redondeo al alza: " + redondeoAlAlza);
            System.out.println("Redondeo a la baja: " + redondeoABaja);
            System.out.println("Truncado en las unidades: " + truncadoUnidades);
        }

        double media = suma / notas.length;
        System.out.println("Media de las notas: " + media);
        System.out.println("Nota máxima: " + maximo);
        System.out.println("Nota mínima: " + minimo);
        scanner.close();
    }
    
}
