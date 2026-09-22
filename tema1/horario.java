public class Horario {
    public static void main(String[] args) {

        System.out.println("HORARIO");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "Hora", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "08:00-09:00", "", "", "", "Programación", "");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "09:00-10:00", "", "", "", "Programación", "");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "10:00-11:00", "", "", "", "", "");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "11:30-12:30", "", "", "", "", "");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "12:30-13:30", "Programación", "Programación", "", "", "Programación");

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s%n",
                "13:30-14:30", "Programación", "Programación", "", "", "Programación");
    }
}
