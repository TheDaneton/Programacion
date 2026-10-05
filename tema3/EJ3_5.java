import java.util.Scanner;

public class EJ3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota del primer examen: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota del segundo examen: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Tu nota de Programación es " + media);
        } else {
            sc.nextLine();

            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = sc.nextLine();

            if (recuperacion.equalsIgnoreCase("apto")) {
                media = 5;
            }

            System.out.println("Tu nota de Programación es " + media);
        }

        sc.close();
    }
}
