package tema7;
public class Array4 {

    public static void main(String[] args) {

        int[] numeros = new int[50];

        for (int i = 0; i < 50; i++) {
            numeros[i] = (i * 2) + 1;
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(numeros[i]);
        }
    }
}