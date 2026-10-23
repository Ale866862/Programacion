import java.util.Scanner;

public class NumerosPrimos {
//5.Escribe un programa que imprima todos los números primos del 1 al 50, cada uno en su línea.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite = 50;

        System.out.println("Números primos del 1 al " + limite + ":");
        for (int numero = 2; numero <= limite; numero++) {
            if (esPrimo(numero)) {
                System.out.println(numero);
            }
        }
        scanner.close();
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
