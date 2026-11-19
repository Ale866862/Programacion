public class ArrayMedia {
    public static void main(String[] args) {
        //9. Que lea 10 números por teclado, los almacene en un array y muestre la media.

        int[] numeros = new int[10];
        int suma = 0;

        System.out.println("Introduce 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
            suma += numeros[i];
        }

        double media = (double) suma / numeros.length;
        System.out.println("Media: " + media);
    }
}
