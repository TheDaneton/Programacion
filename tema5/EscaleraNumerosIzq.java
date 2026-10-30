package tema5;

public class EscaleraNumerosIzq {
    public static void main(String[] args) {

        // 5. Imprimir una escalera invertida de números con bucles anidados

        for (int fila = 1; fila <= 4; fila++) {
            for (int espacio = 4; espacio > fila; espacio--) {
                System.out.print(" ");
            }

            for (int num = fila; num >= 1; num--) {
                System.out.print(num);
            }

            System.out.println();
        }
    }
}
