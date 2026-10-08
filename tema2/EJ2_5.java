import java.util.Scanner;

public class EJ2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero binario: ");
        int binario = sc.nextInt();

        int decimal = 0;
        int potencia = 1;

        while (binario > 0) {
            int cifra = binario % 10;
            decimal = decimal + cifra * potencia;
            potencia = potencia * 2;
            binario = binario / 10;
        }

        System.out.println("El valor decimal es: " + decimal);

        sc.close();
    }
}


