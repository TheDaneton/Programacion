package tema7;
import java.util.Scanner;

public class Array6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Números en orden inverso:");

        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        teclado.close();
    }
}