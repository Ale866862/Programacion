import java.util.Scanner;

public class Palabra {
//3.       Realiza un programa que escriba por pantalla una palabra formada por 5 caracteres alfabéticos aleatorios en mayúsculas y esos mismos en minúsculas.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "";

        for (int i = 0; i < 5; i++) {
            char letraMayuscula = (char) ('A' + Math.random() * 26);
            char letraMinuscula = Character.toLowerCase(letraMayuscula);
            palabra += letraMayuscula;
            System.out.print(letraMinuscula);
        }

        System.out.println("\nPalabra formada por 5 caracteres alfabéticos aleatorios en mayúsculas: " + palabra);
        scanner.close();
    }
}
