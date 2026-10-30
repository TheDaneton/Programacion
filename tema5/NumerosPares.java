package tema5;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        // 9. Mostrar los números pares entre 1 y el número introducido

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}
