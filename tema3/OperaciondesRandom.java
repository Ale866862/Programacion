import java.util.Scanner;

public class OperaciondesRandom {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1 = (int) (Math.random() * 10);
        int numero2 = (int) (Math.random() * 10);

        System.out.println("Calcula el resultado de " + numero1 + " + " + numero2 + " : ");
        int resultado = numero1 + numero2;
        if (resultado == input.nextInt()) {
            System.out.println("¡Correcto!");
        } else {
            System.out.println("Incorrecto. La respuesta correcta es: " + resultado);
        }

        input.close();
    }
}
