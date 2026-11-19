public class Array18 {
    public static void main(String[] args) {
        // 18. Que lea una cadena y diga cuantas mayúsculas hay.

        System.out.println("Introduce una cadena:");
        String cadena = System.console().readLine();

        int contadorMayusculas = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                contadorMayusculas++;
            }
        }

        System.out.println("La cadena contiene " + contadorMayusculas + " mayúsculas.");
    }
}
