package tema7;
import java.util.Scanner;

public class Array7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        double suma = numeros[0];
        double resta = numeros[0];
        double multiplicacion = numeros[0];
        double division = numeros[0];

        for (int i = 1; i < 10; i++) {
            suma = suma + numeros[i];
            resta = resta - numeros[i];
            multiplicacion = multiplicacion * numeros[i];

            if (numeros[i] != 0) {
                division = division / numeros[i];
            }
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        teclado.close();
    }
}