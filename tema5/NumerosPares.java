import java.util.Scanner;

public class NumerosPares {
    //9. Números pares. Pide un número entero al usuario y muestra todos los números pares comprendidos entre 1 y ese número. 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares entre 1 y " + numero + ":");
        for (int i = 2; i <= numero; i += 2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
