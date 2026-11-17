import java.util.Scanner;

public class CuantosPrimos {
    //5. Módulo al que se le pasa un número entero y devuelve el número de divisores primos que tiene.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        int cantidadPrimos = contarDivisoresPrimos(numero);
        System.out.println("El número de divisores primos de " + numero + " es: " + cantidadPrimos);
        scanner.close();
    }

    public static int contarDivisoresPrimos(int numero) {
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
