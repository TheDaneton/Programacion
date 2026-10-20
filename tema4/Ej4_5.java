package tema4;
import java.util.Scanner;

public class Ej4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una palabra: ");
        String palabra = sc.nextLine();

        int posicion = palabra.indexOf('A');

        if (posicion == -1) {
            posicion = palabra.indexOf('a');
        }

        if (posicion != -1) {
            System.out.println("Primera parte: " + palabra.substring(0, posicion));
            System.out.println("Segunda parte: " + palabra.substring(posicion));
        } else {
            System.out.println("La palabra no contiene ninguna A.");
        }

        sc.close();
    }
}