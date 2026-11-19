package tema6;
public class DivisoresPrimos {

    public static int contarDivisoresPrimos(int numero) {
        int divisores = 0;

        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                boolean primo = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        primo = false;
                    }
                }

                if (primo) {
                    divisores++;
                }
            }
        }

        return divisores;
    }

    public static void main(String[] args) {
        int numero = 60;

        System.out.println("El número de divisores primos es: " + contarDivisoresPrimos(numero));
    }
}