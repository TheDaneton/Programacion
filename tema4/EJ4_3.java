package tema4;
public class EJ4_3 {
    public static void main(String[] args) {
        String mayusculas = "";
        String minusculas = "";

        for (int i = 0; i < 5; i++) {
            char letra = (char) (65 + (int)(Math.random() * 26));
            mayusculas = mayusculas + letra;
            minusculas = minusculas + (char)(letra + 32);
        }

        System.out.println(mayusculas);
        System.out.println(minusculas);
    }
}