import java.util.Scanner;

public class EscaleraDeNumeros {
    //4.Escribe un programa que imprima esta escalera de números (bucles anidados): 
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//Pista: bucle exterior del 1 al 4 (las filas) y bucle interior que imprime del 1 al número de fila, con print para no saltar de línea y un println() vacío al final de cada fila.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int filas = 4;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
