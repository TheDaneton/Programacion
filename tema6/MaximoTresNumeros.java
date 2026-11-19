package tema6;

public class MaximoTresNumeros {

    public static int maximo(int numero1, int numero2, int numero3) {

        if (numero1 > numero2 && numero1 > numero3) {
            return numero1;
        } else if (numero2 > numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

    public static void main(String[] args) {

        System.out.println(maximo(8, 5, 12));

    }
}
