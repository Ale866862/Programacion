public class Array21 {
    public static void main(String[] args) {
        //21. Un vector de 30 elementos contiene los nombres de 30 empleados y otro de similares características las horas trabajadas por cada uno de ellos. Si la hora se paga a 20 €., calcular e imprimir lo que cobrará cada uno de ellos.

        String[] empleados = new String[30];
        int[] horasTrabajadas = new int[30];
        double tarifaHora = 20.0;

        // Rellenar los arrays con datos de ejemplo
        for (int i = 0; i < empleados.length; i++) {
            empleados[i] = "Empleado " + (i + 1);
            horasTrabajadas[i] = (int) (Math.random() * 41); // Horas trabajadas entre 0 y 40
        }

        // Calcular e imprimir lo que cobrará cada empleado
        System.out.println("Cálculo de salarios:");
        for (int i = 0; i < empleados.length; i++) {
            double salario = horasTrabajadas[i] * tarifaHora;
            System.out.println(empleados[i] + " ha trabajado " + horasTrabajadas[i] + " horas y cobrará: " + salario + " €");
        }
    }
}
