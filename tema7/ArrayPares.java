public class ArrayPares {
    public static void main(String[] args) {
        //3. Escribe un programa que rellene un array con los números pares comprendidos entre 1 y 100 y los muestre en pantalla en orden ascendente.

        int[] numerosPares = new int[50];

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
        }

        System.out.println("Números pares del 1 al 100 en orden ascendente:");
        for (int numero : numerosPares) {
            System.out.print(numero + " ");
        }
    }
}
