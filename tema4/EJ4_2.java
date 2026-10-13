package tema4;
import java.util.Random;

public class EJ4_2 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
        String[] cartas = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int numeroCarta = random.nextInt(13);
        int numeroPalo = random.nextInt(4);

        System.out.println("La carta elegida es: " + cartas[numeroCarta] + " de " + palos[numeroPalo]);
    }
}