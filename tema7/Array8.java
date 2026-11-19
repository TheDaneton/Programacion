package tema7;
public class Array8 {

    public static void main(String[] args) {

        int[] numeros = new int[100];
        int suma = 0;

        for (int i = 0; i < 100; i++) {
            numeros[i] = (i + 1) * 2;
            suma = suma + numeros[i];
        }

        System.out.println("La suma de los 100 primeros números pares es: " + suma);
    }
}