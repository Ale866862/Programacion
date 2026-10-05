import java.util.Scanner;

public class PrimeraHora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = teclado.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("A primera hora tienes Matemáticas.");
                break;
            case "martes":
                System.out.println("A primera hora tienes Lengua.");
                break;
            case "miércoles":
                System.out.println("A primera hora tienes Inglés.");
                break;
            case "jueves":
                System.out.println("A primera hora tienes Física.");
                break;
            case "viernes":
                System.out.println("A primera hora tienes Historia.");
                break;
            default:
                System.out.println("El día introducido no es válido.");
        }

        teclado.close();
    }
}