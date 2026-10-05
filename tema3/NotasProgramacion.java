import java.util.Scanner;

public class NotasProgramacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Nota del primer control: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Nota del segundo control: ");
        double nota2 = teclado.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media);
        } else {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = teclado.next();

            if (recuperacion.equalsIgnoreCase("apto")) {
                media = 5;
            }

            System.out.println("Tu nota de Programación es " + media);
        }

        teclado.close();
    }
}