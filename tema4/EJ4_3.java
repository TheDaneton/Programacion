
package tema4;

public class EJ4_3 {
    public static void main(String[] args) {
        String mayus = "";
        String minus = "";
        int i = 0;

        while (i < 5) {
            int numero = (int) (Math.random() * 26);
            String letra = "" + (char) (65 + numero);

            mayus = mayus + letra;
            minus = minus + letra.toLowerCase();

            i++;
        }

        System.out.println(mayus);
        System.out.println(minus);
    }
}
