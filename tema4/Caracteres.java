package tema4;
public class Caracteres {
    public static void main(String[] args) {
        int numero = (int) (Math.random() * 4);
        char caracter = ' ';

        if (numero == 0) {
            caracter = '#';
        } else if (numero == 1) {
            caracter = '$';
        } else if (numero == 2) {
            caracter = '€';
        } else {
            caracter = '&';
        }

        System.out.println("" + caracter + caracter + caracter + caracter + caracter);
    }
}