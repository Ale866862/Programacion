public class Array16 {
    public static void main(String[] args) {
        //16. Que lea una cadena y la muestre al revés.

        System.out.println("Introduce una cadena:");
        String cadena = System.console().readLine();

        StringBuilder cadenaReves = new StringBuilder(cadena);
        cadenaReves.reverse();

        System.out.println("La cadena al revés es: " + cadenaReves.toString());
    }
}
