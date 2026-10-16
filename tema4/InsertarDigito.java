package tema4;
import java.util.Scanner;

public class InsertarDigito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numero;
        String parte1, parte2;
        int posicion, digito;

        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLine();

        System.out.print("Introduzca la posición donde quiere insertar: ");
        posicion = teclado.nextInt();

        System.out.print("Introduzca el dígito que quiere insertar: ");
        digito = teclado.nextInt();

        parte1 = numero.substring(0, posicion - 1);
        parte2 = numero.substring(posicion - 1);

        numero = parte1 + digito + parte2;

        System.out.println("El número resultante es " + numero);

        teclado.close();
    }
}