import java.util.Scanner;

public class Amigos {
    //6. Escriba una función que decida si dos números enteros positivos son amigos. Dos números son amigos, si la suma de sus divisores (distintos de ellos mismos) son iguales.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número entero positivo: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número entero positivo: ");
        int num2 = scanner.nextInt();

        if (sonAmigos(num1, num2)) {
            System.out.println(num1 + " y " + num2 + " son números amigos.");
        } else {
            System.out.println(num1 + " y " + num2 + " no son números amigos.");
        }
        scanner.close();
    }

    public static boolean sonAmigos(int num1, int num2) {
        return sumaDivisores(num1) == num2 && sumaDivisores(num2) == num1;
    }

    public static int sumaDivisores(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
