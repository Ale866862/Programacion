import java.util.Scanner;

public class Maxim3numeros {
    //3. Dime una versión que calcule el máximo de 3 números.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        System.out.println("El máximo de los tres números es: " + max);
        scanner.close();
    }
}
