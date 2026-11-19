public class ArrayDescendente {
    public static void main(String[] args) {    
        //1. Escribe un programa que rellene un array con los 100 primeros números enteros en orden descendente y los muestre en pantalla.

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 100 - i;
        }

        System.out.println("Números del 100 al 1 en orden descendente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
