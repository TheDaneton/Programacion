package tema5;

import java.util.Scanner;

public class ComprobarPrimo {
    public static void main(String[] args) {

        // 11. Comprobar si un número es primo

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número mayor que 1: ");
        int num = sc.nextInt();

        int divisores = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisores++;
            }
        }

        if (divisores == 2) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

        sc.close();
    }
}
