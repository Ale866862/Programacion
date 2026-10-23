import java.util.Scanner;

public class Cohete {
    
    //1.Escribe un programa llamado Cohete que cuente desde 5 hasta 0 con un while y luego muestre “¡Despegue! 🚀”. Muestra un número por línea.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 5;

        while (contador >= 0) {
            System.out.println(contador);
            contador--;
        }

        System.out.println("¡Despegue! 🚀");
        scanner.close();
    }
}
