public class ArrayAscendente {
    public static void main(String[] args) {    
        //1. Escribe un programa que rellene un array con los 100 primeros números enteros en orden ascendente y los muestre en pantalla.

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números del 1 al 100 en orden ascendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}