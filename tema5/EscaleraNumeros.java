package tema5;
public class EscaleraNumeros {
    public static void main(String[] args) {
        // Escribe un programa que imprima esta escalera de números usando bucles anidados.

        for (int i = 1; i <= 4; i++) {
            for (int numero = 1; numero <= i; numero++) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}