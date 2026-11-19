public class ArrayPrimos {
    public static void main(String[] args) {
        //4. Escribe un programa que rellene un array con los números primos comprendidos entre 1 y 100 y los muestre en pantalla en orden ascendente.

        int[] numerosPrimos = new int[25];
        int contador = 0;

        for (int i = 2; i <= 100; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                numerosPrimos[contador] = i;
                contador++;
            }
        }

        System.out.println("Números primos del 1 al 100 en orden ascendente:");
        for (int numero : numerosPrimos) {
            System.out.print(numero + " ");
        }
    }
}
