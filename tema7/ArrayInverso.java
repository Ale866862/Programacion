public class ArrayInverso {
    public static void main(String[] args) {
        //6. Escribe un programa que lea 10 números por teclado, los almacene en un array y muestre los números insertados en orden inverso.

        int[] numeros = new int[10];

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Números en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
