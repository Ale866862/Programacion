public class Array22 {
    public static void main(String[] args) {
        /*22. Si disponemos de los 2 vectores del ejercicio anterior, calcula y muestra por pantalla el empleado que más gana y el que menos gana. */

        String[] empleados = {"Juan", "María", "Pedro", "Ana", "Luis"};
        double[] salarios = {2500.0, 3000.0, 2000.0, 3500.0, 2800.0};

        double salarioMaximo = salarios[0];
        double salarioMinimo = salarios[0];
        String empleadoMaximo = empleados[0];
        String empleadoMinimo = empleados[0];

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > salarioMaximo) {
                salarioMaximo = salarios[i];
                empleadoMaximo = empleados[i];
            }
            if (salarios[i] < salarioMinimo) {
                salarioMinimo = salarios[i];
                empleadoMinimo = empleados[i];
            }
        }

        System.out.println("Empleado que más gana: " + empleadoMaximo + " con un salario de " + salarioMaximo);
        System.out.println("Empleado que menos gana: " + empleadoMinimo + " con un salario de " + salarioMinimo);
    }
}
