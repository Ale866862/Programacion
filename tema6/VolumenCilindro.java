import java.util.Scanner;

public class VolumenCilindro {
    //4. Realizar una función que calcule (muestre en pantalla) volumen de un cilindro. Además hemos de pasarle a la función el radio y la altura.
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Introduce el radio del cilindro: ");
        double radio = teclado.nextDouble();
        System.out.print("Introduce la altura del cilindro: ");
        double altura = teclado.nextDouble();

        double volumen = calcularVolumenCilindro(radio, altura);
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static double calcularVolumenCilindro(double radio, double altura) {
        return Math.PI * radio * radio * altura;
    }
}
