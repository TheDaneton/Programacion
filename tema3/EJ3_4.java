import java.util.Scanner;

public class EJ3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo (máximo 5 cifras): ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 99999) {
            System.out.println("El número no es válido.");
        } else {
            int original = numero;
            int invertido = 0;

            while (numero > 0) {
                int cifra = numero % 10;
                invertido = invertido * 10 + cifra;
                numero = numero / 10;
            }

            if (original == invertido) {
                System.out.println("El número es capicúa.");
            } else {
                System.out.println("El número no es capicúa.");
            }
        }

        sc.close();
    }
}
