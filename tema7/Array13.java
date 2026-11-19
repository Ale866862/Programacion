public class Array13 {
    public static void main(String[] args) {
        //13. Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y los muestre todos ordenados usando un tercer array.

        int[] arrayOriginal = new int[5];
        int[] arrayMultiplicado = new int[5];
        int[] arrayOrdenado = new int[5];

        System.out.println("Introduce 5 números:");

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = Integer.parseInt(System.console().readLine());
            arrayMultiplicado[i] = arrayOriginal[i] * 2; // Copiar y multiplicar por 2
        }

        // Copiar los elementos del array multiplicado al array ordenado
        System.arraycopy(arrayMultiplicado, 0, arrayOrdenado, 0, arrayMultiplicado.length);

        // Ordenar el tercer array
        java.util.Arrays.sort(arrayOrdenado);

        System.out.println("Tercer array (números multiplicados por 2 y ordenados):");
        for (int i = 0; i < arrayOrdenado.length; i++) {
            System.out.print(arrayOrdenado[i] + " ");
        }
    }
}
