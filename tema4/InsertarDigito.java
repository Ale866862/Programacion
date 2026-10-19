import java.util.Scanner;

public class InsertarDigito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = scanner.nextLong();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        int posicion = scanner.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        int digito = scanner.nextInt();

        String numeroStr = Long.toString(numero);
        StringBuilder resultado = new StringBuilder();

        // Insertar el dígito en la posición indicada
        for (int i = 0; i < numeroStr.length(); i++) {
            if (i == posicion - 1) {
                resultado.append(digito);
            }
            resultado.append(numeroStr.charAt(i));
        }

        // Si la posición es mayor que la longitud del número, añadir el dígito al final
        if (posicion > numeroStr.length()) {
            resultado.append(digito);
        }

        System.out.println("El número resultante es " + resultado.toString() + ".");

        // EXTRA: insertar <> justo en la mitad de la cadena original
        int mitad = numeroStr.length() / 2;
        StringBuilder resultadoExtra = new StringBuilder(numeroStr);
        resultadoExtra.insert(mitad, "<>");

        System.out.println("La cadena con <> en la mitad es: " + resultadoExtra);

        scanner.close();
    }
}