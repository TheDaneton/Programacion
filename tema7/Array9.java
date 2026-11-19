package tema7;
import java.util.Scanner;

public class Array9 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma = suma + numeros[i];
        }

        double media = suma / 10;

        System.out.println("La media es: " + media);
        teclado.close();
    }
}