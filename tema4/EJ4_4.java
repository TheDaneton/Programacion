package tema4;

import java.util.Scanner;

public class EJ4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero entero positivo: ");
        long numero = sc.nextLong();

        System.out.print("Introduzca la posicion donde quiere insertar: ");
        int posicion = sc.nextInt();

        System.out.print("Introduzca el digito que quiere insertar: ");
        int digito = sc.nextInt();

        long divisor = 1;
        long copia = numero;

        while (copia >= 10) {
            copia = copia / 10;
            divisor = divisor * 10;
        }

        for (int i = 1; i < posicion; i++) {
            divisor = divisor / 10;
        }

        long parteIzquierda = numero / divisor;
        long parteDerecha = numero % divisor;

        long resultado = parteIzquierda * divisor * 10
                + digito * divisor + parteDerecha;

        System.out.println("El numero resultante es " + resultado);

        sc.close();
    }
}
