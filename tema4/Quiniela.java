package tema4;

public class Quiniela {
    public static void main(String[] args) {
        int numero = 0;
        int intento = 0;

        while (intento != 15) {
            intento++;
            numero = (int) (Math.random() * 6) + 1;

            if (numero <= 3) {
                System.out.println("Intento numero " + intento + ": 1");
            } else if (numero <= 5) {
                System.out.println("Intento numero " + intento + ": X");
            } else {
                System.out.println("Intento numero " + intento + ": 2");
            }
        }
    }
}
