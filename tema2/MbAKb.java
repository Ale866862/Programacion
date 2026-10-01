import java.util.Scanner;

//realiza un programa que convierta una cantidad de Megabytes a kilobytes

public class MbAKb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la cantidad de Megabytes: ");
        double megabytes = input.nextDouble();

        double kilobytes = megabytes * 1024;

        System.out.println(megabytes + " Megabytes son " + kilobytes + " Kilobytes");
        input.close();
    }
}