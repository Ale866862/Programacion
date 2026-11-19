public class ArrayDeArrays {
    public static void main(String[] args) {
        //11. Que lea 10 números por teclado, 5 para un array y 5 para otro array distinto. Crea un tercer array donde se almacenen los dos array anteriores y muestras 10 números en pantalla mediante este último array

        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];

        System.out.println("Introduce 5 números para el primer array:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(System.console().readLine());
            array3[i] = array1[i]; // Almacenar en el tercer array
        }

        System.out.println("Introduce 5 números para el segundo array:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(System.console().readLine());
            array3[i + 5] = array2[i]; // Almacenar en el tercer array
        }

        System.out.println("Números del tercer array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
