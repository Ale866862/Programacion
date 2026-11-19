public class Array12 {
    public static void main(String[] args) {
        //12. Que lea 5 números por teclado, los copie a otro array multiplicados por 2 y muestre el segundo array.

        int[] arrayOriginal = new int[5];
        int[] arrayMultiplicado = new int[5];

        System.out.println("Introduce 5 números:");

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = Integer.parseInt(System.console().readLine());
            arrayMultiplicado[i] = arrayOriginal[i] * 2; // Copiar y multiplicar por 2
        }

        System.out.println("Segundo array (números multiplicados por 2):");
        for (int i = 0; i < arrayMultiplicado.length; i++) {
            System.out.print(arrayMultiplicado[i] + " ");
        }
    }
}
