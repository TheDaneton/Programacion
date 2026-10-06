import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es divisible por 2 y por 3.");
        } else if (numero % 2 == 0) {
            System.out.println("El número es divisible por 2.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else {
            System.out.println("El número no es divisible ni por 2 ni por 3.");
        }
        
        sc.close();
    }
}