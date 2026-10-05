import java.util.Scanner;

public class EJ3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes");
        } else if (hora >= 21 || hora <= 5) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("Valor introducido no valido");
        }

        sc.close();
    }
}
