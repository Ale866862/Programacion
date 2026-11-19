public class Array19 {
    public static void main(String[] args) {
        //19. El cifrado del cesar: Lea una cadena y la encripte sumando 3 al código ASCII de cada carácter. Mostrar por pantalla. Crea un método para encriptar y otro para desencriptar.

        System.out.println("Introduce una cadena para encriptar:");
        String cadena = System.console().readLine();

        String cadenaEncriptada = encriptar(cadena);
        System.out.println("Cadena encriptada: " + cadenaEncriptada);

        String cadenaDesencriptada = desencriptar(cadenaEncriptada);
        System.out.println("Cadena desencriptada: " + cadenaDesencriptada);
    }

    public static String encriptar(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (char c : cadena.toCharArray()) {
            resultado.append((char) (c + 3));
        }
        return resultado.toString();
    }

    public static String desencriptar(String cadena) {
        StringBuilder resultado = new StringBuilder();
        for (char c : cadena.toCharArray()) {
            resultado.append((char) (c - 3));
        }
        return resultado.toString();
    }
}
