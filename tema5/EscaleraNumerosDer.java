package tema5;
public class EscaleraNumerosDer {
    public static void main(String[] args) {

        // 4. Imprimir una escalera de números con bucles anidados

        for (int fila = 1; fila <= 4; fila++) {
            for (int num = 1; num <= fila; num++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}