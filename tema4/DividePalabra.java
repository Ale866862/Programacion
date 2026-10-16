import java.util.Scanner;

public class DividePalabra {
//5.       Programa que divida una palabra desde la primera A que encuentre.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();

        int indiceA = palabra.indexOf('A');

        if (indiceA != -1) {
            String parte1 = palabra.substring(0, indiceA);
            String parte2 = palabra.substring(indiceA + 1);
            System.out.println("Parte antes de la primera A: " + parte1);
            System.out.println("Parte después de la primera A: " + parte2);
        } else {
            System.out.println("No se encontró la letra A en la palabra.");
        }

        scanner.close();
    }
}
