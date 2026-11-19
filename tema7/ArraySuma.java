public class ArraySuma {
    public static void main(String[] args) {
        //8. Que rellene un array con los 100 primeros números pares y muestre su suma.

        int[] numerosPares = new int[100];
        int suma = 0;

        for (int i = 0; i < numerosPares.length; i++) {
            numerosPares[i] = (i + 1) * 2;
            suma += numerosPares[i];
        }

        System.out.println("Suma de los 100 primeros números pares: " + suma);
    }
}
