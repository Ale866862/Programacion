import java.util.Scanner;

public class KbAMb {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce la cantidad de Kilobytes: ");
        double kilobytes = input.nextDouble();

        double megabytes = kilobytes / 1024;

        System.out.println(kilobytes + " Kilobytes son " + megabytes + " Megabytes");
        input.close();
    }
}
