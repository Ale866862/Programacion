public class ArrayImpares {
    public static void main(String[] args) {
        //2. Escribe un programa que rellene un array con los números impares comprendidos entre 1 y 100 y los muestre en pantalla en orden ascendente.

        int[] numerosImpares = new int[50];

        for (int i = 0; i < numerosImpares.length; i++) {
            numerosImpares[i] = (i * 2) + 1;
        }

        System.out.println("Números impares del 1 al 100 en orden ascendente:");
        for (int numero : numerosImpares) {
            System.out.print(numero + " ");
        }
    }
}
