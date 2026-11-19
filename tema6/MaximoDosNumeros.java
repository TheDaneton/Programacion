package tema6;

public class MaximoDosNumeros {

    public static int maximo(int numero1, int numero2) {

        if (numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }

    public static void main(String[] args) {

        System.out.println(maximo(8, 5));

    }
}
