package tema5;

import java.util.Scanner;

public class RectanguloAsteriscos {
    public static void main(String[] args) {

        // 12. Dibujar un rectángulo de asteriscos

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas: ");
        int filas = sc.nextInt();

        System.out.print("Introduce el número de columnas: ");
        int columnas = sc.nextInt();

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
