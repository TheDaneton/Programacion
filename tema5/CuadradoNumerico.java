package tema5;

import java.util.Scanner;

public class CuadradoNumerico {
    public static void main(String[] args) {

        // 13. Dibujar un cuadrado numérico

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el valor de N: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
