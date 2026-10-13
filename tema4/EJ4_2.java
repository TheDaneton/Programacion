package tema4;

public class EJ4_2 {
    public static void main(String[] args) {

        int numeroCarta = (int)(Math.random() * 13) + 1;
        int numeroPalo = (int)(Math.random() * 4) + 1;

        String carta;
        String palo;

        if (numeroCarta == 1) {
            carta = "A";
        } else if (numeroCarta == 11) {
            carta = "J";
        } else if (numeroCarta == 12) {
            carta = "Q";
        } else if (numeroCarta == 13) {
            carta = "K";
        } else {
            carta = "" + numeroCarta;
        }

        if (numeroPalo == 1) {
            palo = "picas";
        } else if (numeroPalo == 2) {
            palo = "corazones";
        } else if (numeroPalo == 3) {
            palo = "diamantes";
        } else {
            palo = "tréboles";
        }

        System.out.println("La carta elegida es: " + carta + " de " + palo);
    }
}