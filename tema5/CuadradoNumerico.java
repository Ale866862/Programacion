import java.util.Scanner;

public class CuadradoNumerico {
    //13. Cuadrado numérico. Pide un número N y muestra un cuadrado de N filas y N columnas con números del 1 al N en cada fila.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Por favor, introduce un número positivo.");
        } else {
            for (int i = 0; i < N; i++) {
                for (int j = 1; j <= N; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
