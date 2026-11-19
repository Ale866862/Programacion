public class Array15 {
    public static void main(String[] args) {
        //15. Que rellene un array con 20 números y luego busque un número concreto.

        int[] numeros = new int[20];
        int numeroBuscado;

        System.out.println("Introduce 20 números:");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Introduce el número que deseas buscar:");
        numeroBuscado = Integer.parseInt(System.console().readLine());

        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("El número " + numeroBuscado + " se encuentra en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el array.");
        }
    }
}
