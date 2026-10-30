import java.util.Scanner;

public class ContarCifras {
  //10. Contar cifras. Pide un número entero positivo y calcula cuántas cifras tiene sin convertirlo a texto. 

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número entero positivo: ");
            int numero = scanner.nextInt();
    
            if (numero < 0) {
                System.out.println("Por favor, introduce un número positivo.");
            } else {
                int cifras = 0;
                do {
                    numero /= 10;
                    cifras++;
                } while (numero > 0);
    
                System.out.println("El número tiene " + cifras + " cifras.");
            }
            scanner.close();
        }
}
