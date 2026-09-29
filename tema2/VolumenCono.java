import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio del cono: ");
        double r = sc.nextDouble();

        System.out.print("Introduce la altura del cono: ");
        double h = sc.nextDouble();

        double V = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;

        System.out.println("El volumen del cono es: " + V);

        sc.close();
    }
}
