package tema4;

import java.util.Scanner;

public class NotasDiv {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota, suma = 0, max = 0, min = 10;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota " + i + ": ");
            nota = teclado.nextDouble();

            System.out.println("Redondeo al alza: " + Math.ceil(nota * 10) / 10);
            System.out.println("Redondeo a la baja: " + Math.floor(nota * 10) / 10);
            System.out.println("Nota truncada: " + (int) nota);

            suma = suma + nota;

            if (i == 1 || nota > max) {
                max = nota;
            }

            if (i == 1 || nota < min) {
                min = nota;
            }
        }

        System.out.println("Media: " + suma / 5);
        System.out.println("Nota máxima: " + max);
        System.out.println("Nota mínima: " + min);

        teclado.close();
    }
}