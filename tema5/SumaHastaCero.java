package tema5;
import java.util.Scanner;

public class SumaHastaCero {
    public static void main(String[] args) {
        // Escribe un programa que sume números enteros introducidos por el usuario hasta que escriba 0. Muestra la suma final.

        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = sc.nextInt();
            suma = suma + numero;
        } while (numero != 0);

        System.out.println("La suma final es: " + suma);

        sc.close();
    }
}