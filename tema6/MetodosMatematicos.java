import java.util.Scanner;

public class MetodosMatematicos {
// 1.       Crea una biblioteca de funciones matemáticas que contenga las siguientes
 //funciones. Recuerda que puedes usar unas dentro de otras si es necesario. Se deberá realizar un menú para poder ejecutarlas.
//esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
//potencia: Dada una base y un exponente devuelve la potencia.
//digitos: Cuenta el número de dígitos de un número entero.
//voltea: Le da la vuelta a un número.
//quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
//pegaPorDelante: Añade un dígito a un número por delante.

    public static boolean esCapicua(int numero) {
        long valor = Math.abs((long) numero);
        long original = valor;
        long invertido = 0;
        while (valor > 0) {
            invertido = invertido * 10 + valor % 10;
            valor /= 10;
        }
        return original == invertido;
    }

    public static int potencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser no negativo");
        }
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = Math.multiplyExact(resultado, base);
        }
        return resultado;
    }

    public static int digitos(int numero) {
        long valor = Math.abs((long) numero);
        int cantidad = 1;
        while (valor >= 10) {
            valor /= 10;
            cantidad++;
        }
        return cantidad;
    }

    public static int voltea(int numero) {
        long valor = Math.abs((long) numero);
        long invertido = 0;
        while (valor > 0) {
            invertido = invertido * 10 + valor % 10;
            valor /= 10;
        }
        return Math.toIntExact(numero < 0 ? -invertido : invertido);
    }

    public static int quitaPorDetras(int numero, int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad debe ser no negativa");
        }
        long divisor = 1;
        for (int i = 0; i < cantidad; i++) {
            divisor *= 10;
        }
        return (int) (numero / divisor);
    }

    public static int pegaPorDelante(int numero, int digito) {
        if (digito < 0 || digito > 9) {
            throw new IllegalArgumentException("El dígito debe estar entre 0 y 9");
        }

        long valor = Math.abs((long) numero);
        long divisor = 1;
        while (valor >= divisor) {
            divisor *= 10;
        }

        long resultado = digito * divisor + valor;
        return Math.toIntExact(numero < 0 ? -resultado : resultado);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de funciones matemáticas:");
            System.out.println("1. esCapicua");
            System.out.println("2. potencia");
            System.out.println("3. digitos");
            System.out.println("4. voltea");
            System.out.println("5. quitaPorDetras");
            System.out.println("6. pegaPorDelante");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número: ");
                    int numCapicua = scanner.nextInt();
                    System.out.println("¿Es capicúa? " + esCapicua(numCapicua));
                    break;
                case 2:
                    System.out.print("Introduce la base: ");
                    int base = scanner.nextInt();
                    System.out.print("Introduce el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println("Resultado: " + potencia(base, exponente));
                    break;
                case 3:
                    System.out.print("Introduce un número: ");
                    int numDigitos = scanner.nextInt();
                    System.out.println("Número de dígitos: " + digitos(numDigitos));
                    break;
                case 4:
                    System.out.print("Introduce un número: ");
                    int numVoltea = scanner.nextInt();
                    System.out.println("Número volteado: " + voltea(numVoltea));
                    break;
                case 5:
                    System.out.print("Introduce un número: ");
                    int numQuita = scanner.nextInt();
                    System.out.print("Introduce cuántos dígitos quitar por detrás: ");
                    int nQuita = scanner.nextInt();
                    System.out.println("Resultado: " + quitaPorDetras(numQuita, nQuita));
                    break;
                case 6:
                    System.out.print("Introduce un número: ");
                    int numPega = scanner.nextInt();
                    System.out.print("Introduce el dígito a añadir por delante: ");
                    int digitoPega = scanner.nextInt();
                    System.out.println("Resultado: " + pegaPorDelante(numPega, digitoPega));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;  
        }
    } while (opcion != 0);
scanner.close();    
}

}
