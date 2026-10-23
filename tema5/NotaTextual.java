import java.util.Scanner;

public class NotaTextual {
    
    //3.Escribe un programa que convierta una nota numérica (double nota) en su calificación textual usando if/else if: 
//>= 9 → “Sobresaliente” 
//>= 7 → “Notable” 
//== 6 → “Bien” 
//>= 5 → “Aprobado” 
//>= 0 → “Suspenso” 
//Cualquier otro valor (negativo o mayor que 10) → “Nota inválida”

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota (0-10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota == 6) {
            System.out.println("Bien");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Aprobado");
        } else if (nota >= 0 && nota < 5) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota inválida");
        }
        scanner.close();
    }
}
