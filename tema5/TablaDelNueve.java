import java.util.Scanner;

public class TablaDelNueve {
    
    //2.Escribe un programa llamado TablaDelNueve que muestre la tabla de multiplicar del 9 (del 1 al 10) usando un for:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 9;

        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
