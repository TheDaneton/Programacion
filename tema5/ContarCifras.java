package tema5;

import java.util.Scanner;

public class ContarCifras {
    public static void main(String[] args) {

        // 10. Contar las cifras de un número entero positivo

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        int num = sc.nextInt();

        int cifras = 0;

        while (num > 0) {
            num = num / 10;
            cifras++;
        }

        System.out.println("El número tiene " + cifras + " cifras.");

        sc.close();
    }
}
