import java.util.Random;

public class Baraja {
    public static void main(String[] args) {
        String[] palos = {"Picas", "Corazones", "Diamantes", "Tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        int paloIndex = random.nextInt(palos.length);
        int cartaIndex = random.nextInt(cartas.length);

        String cartaSeleccionada = cartas[cartaIndex] + " de " + palos[paloIndex];
        System.out.println("Carta seleccionada al azar: " + cartaSeleccionada);
    }

}
