import java.util.Scanner;

public class SalarioSemanal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        double horas = input.nextDouble();

        double salario = horas * 12;

        System.out.println("El salario semanal es: " + salario + " euros");
    }
}
