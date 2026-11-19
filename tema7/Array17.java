public class Array17 {
    public static void main(String[] args) {
        //17. Que lea una cadena y diga cuantas vocales hay.

        System.out.println("Introduce una cadena:");
        String cadena = System.console().readLine();

        int contadorVocales = 0;
        cadena = cadena.toLowerCase();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("La cadena contiene " + contadorVocales + " vocales.");
    }
}
