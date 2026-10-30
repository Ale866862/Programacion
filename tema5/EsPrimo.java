import java.util.Scanner;

public class EsPrimo {
    //11. Números primos. Pide un número entero mayor que 1 y determina si es primo utilizando un bucle. 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero mayor que 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Por favor, introduce un número mayor que 1.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
        scanner.close();
    }
}
