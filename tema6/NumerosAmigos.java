package tema6;
public class NumerosAmigos {

    public static int sumaDivisores(int numero) {
        int suma = 0;

        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }

        return suma;
    }

    public static boolean sonAmigos(int numero1, int numero2) {
        return sumaDivisores(numero1) == sumaDivisores(numero2);
    }

    public static void main(String[] args) {
        int numero1 = 220;
        int numero2 = 284;

        if (sonAmigos(numero1, numero2)) {
            System.out.println("Los números son amigos.");
        } else {
            System.out.println("Los números no son amigos.");
        }
    }
}