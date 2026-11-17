import java.util.Scanner;

public class DiseñoFuncion {
    Scanner scanner = new Scanner(System.in);

    public static int maximo(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = teclado.nextInt();

        int mayor = maximo(num1, num2);

        System.out.println("El número mayor es: " + mayor);

        teclado.close();
    }
}