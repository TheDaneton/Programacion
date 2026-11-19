package tema6;
import java.util.Scanner;

public class Biblioteca {

    public static boolean esCapicua(int numero) {
        return numero == voltea(numero);
    }

    public static int potencia(int base, int exponente) {
        int resultado = 1;

        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }

        return resultado;
    }

    public static int digitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            return 1;
        }

        while (numero != 0) {
            numero = numero / 10;
            contador++;
        }

        return contador;
    }

    public static int voltea(int numero) {
        int resultado = 0;

        while (numero != 0) {
            resultado = resultado * 10 + numero % 10;
            numero = numero / 10;
        }

        return resultado;
    }

    public static int quitaPorDetras(int numero, int n) {
        return numero / potencia(10, n);
    }

    public static int pegaPorDelante(int numero, int digito) {
        return digito * potencia(10, digitos(numero)) + numero;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println();
            System.out.println("--- BIBLIOTECA MATEMATICA ---");
            System.out.println("1. Es capicua");
            System.out.println("2. Potencia");
            System.out.println("3. Digitos");
            System.out.println("4. Voltea");
            System.out.println("5. Quita por detras");
            System.out.println("6. Pega por delante");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Introduce un numero: ");
                    int numero1 = sc.nextInt();

                    System.out.println(esCapicua(numero1));
                    break;

                case 2:
                    System.out.print("Introduce la base: ");
                    int base = sc.nextInt();

                    System.out.print("Introduce el exponente: ");
                    int exponente = sc.nextInt();

                    System.out.println(potencia(base, exponente));
                    break;

                case 3:
                    System.out.print("Introduce un numero: ");
                    int numero2 = sc.nextInt();

                    System.out.println(digitos(numero2));
                    break;

                case 4:
                    System.out.print("Introduce un numero: ");
                    int numero3 = sc.nextInt();

                    System.out.println(voltea(numero3));
                    break;

                case 5:
                    System.out.print("Introduce un numero: ");
                    int numero4 = sc.nextInt();

                    System.out.print("Cuantos digitos quieres quitar: ");
                    int n = sc.nextInt();

                    System.out.println(quitaPorDetras(numero4, n));
                    break;

                case 6:
                    System.out.print("Introduce un numero: ");
                    int numero5 = sc.nextInt();

                    System.out.print("Introduce el digito: ");
                    int digito = sc.nextInt();

                    System.out.println(pegaPorDelante(numero5, digito));
                    break;

                case 0:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        sc.close();
    }
}