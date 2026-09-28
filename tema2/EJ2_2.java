import java.util.Scanner;
public class EJ2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Escriba los grados en fahrenheit: ");
        fahrenheit = sc.nextInt();
        celsius = (5.0/9) * (fahrenheit - 32);

        System.out.println( fahrenheit + " grados fahrenheit son " + celsius + "grados celsius.");

        sc.close();
    }
}