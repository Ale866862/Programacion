public class Array14 {
    public static void main(String[] args) {
        //14. Que mediante un array almacene números tanto positivos como negativos y los muestre ordenados.

        int[] numeros = new int[10];

        System.out.println("Introduce 10 números (positivos o negativos):");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        // Ordenar el array de forma ascendente
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    // Intercambiar los elementos
                    int temp = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = temp;
                }
            }
        }

        System.out.println("Números ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}
