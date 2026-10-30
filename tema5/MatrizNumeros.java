import java.util.Scanner;

public class MatrizNumeros {
    //14. Matriz de números. Pide el número de filas y columnas y muestra una matriz en la que cada posición contenga el número de su fila multiplicado por el número de su columna. 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
