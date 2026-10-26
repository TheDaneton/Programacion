package tema5;
public class NumerosPrimos {
    public static void main(String[] args) {
        // Escribe un programa que imprima todos los números primos del 1 al 50, cada uno en su línea.

        for (int num = 2; num <= 50; num++) {
            int divisores = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(num);
            }
        }
    }
}