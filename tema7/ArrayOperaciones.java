public class ArrayOperaciones {
    public static void main(String[] args) {
        //7. Que lea 10 números por teclado, los almacene en un array y muestre la suma, resta, multiplicación y división de todos.

        int[] numeros = new int[10];
        int suma = 0;
        int resta = 0;
        int multiplicacion = 1;
        double division = 1.0;

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
            suma += numeros[i];
            resta -= numeros[i];
            multiplicacion *= numeros[i];
            if (numeros[i] != 0) {
                division /= numeros[i];
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
