package tema4;
import java.util.Scanner;

public class NumeroPartido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numero;
        int posicion;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLine();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        posicion = teclado.nextInt();

        String parte1 = numero.substring(0, posicion - 1);
        String parte2 = numero.substring(posicion - 1);

        System.out.println("Los números partidos son el " + parte1 + " y el " + parte2);

        teclado.close();
    }
}