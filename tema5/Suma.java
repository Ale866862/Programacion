import java.util.Scanner;

public class Suma {
    //6.Escribe un programa que sume números enteros introducidos por el usuario hasta que escriba 0. Muestra la suma final.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce números enteros para sumarlos (0 para terminar):");
        do {
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma final es: " + suma);
        scanner.close();
    }
}
