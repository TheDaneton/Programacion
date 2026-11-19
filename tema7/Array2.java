package tema7;
public class Array2 {

    public static void main(String[] args) {

        int[] numeros = new int[100];

        for (int i = 0; i < 100; i++) {
            numeros[i] = 100 - i;
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(numeros[i]);
        }
    }
}