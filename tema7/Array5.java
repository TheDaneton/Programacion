package tema7;
public class Array5 {

    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numeros = new int[25];
        int posicion = 0;

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                numeros[posicion] = i;
                posicion++;
            }
        }

        for (int i = 0; i < 25; i++) {
            System.out.println(numeros[i]);
        }
    }
}