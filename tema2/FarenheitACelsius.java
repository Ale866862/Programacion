import java.util.Scanner;

public class FarenheitACelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la temperatura en Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);

        System.out.println("Temperatura en Celsius: " + celsius);
    }
}
