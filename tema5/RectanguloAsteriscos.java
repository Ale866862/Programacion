import java.util.Scanner;

public class RectanguloAsteriscos {
    //12. Rectángulo de asteriscos. Pide al usuario el número de filas y columnas y dibuja un rectángulo de asteriscos. Por ejemplo, para 3 filas y 5 columnas
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
