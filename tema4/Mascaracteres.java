package tema4;
public class Mascaracteres {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6);
        char ca = ' ';

        if (num == 0) {
            ca = '*';
        } else if (num == 1) {
            ca = '-';
        } else if (num == 2) {
            ca = '=';
        } else if (num == 3) {
            ca = '.';
        } else if (num == 4) {
            ca = '|';
        } else {
            ca = '@';
        }

        System.out.println("" + ca + ca + ca + ca + ca );
    }
}