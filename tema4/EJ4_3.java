public class EJ4_3 {
    public static void main(String[] args) {
        String mayusculas = "";
        String minusculas = "";
        int i = 0;

        while (i < 5) {
            int numero = (int) (Math.random() * 26);
            String letra = "" + (char) (65 + numero);

            mayusculas = mayusculas + letra;
            minusculas = minusculas + letra.toLowerCase();

            i++;
        }

        System.out.println(mayusculas);
        System.out.println(minusculas);
    }
}
