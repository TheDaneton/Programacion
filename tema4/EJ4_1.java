package tema4;
import java.util.Scanner;

public class EJ4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0;
        double maximo = 0, minimo = 10;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce la nota " + i + ": ");
            nota = sc.nextDouble();

            if (nota > maximo) {
                maximo = nota;
            }

            if (nota < minimo) {
                minimo = nota;
            }

            suma += nota;

            System.out.println("Redondeada al alza: " + Math.ceil(nota * 10) / 10);
            System.out.println("Redondeada a la baja: " + Math.floor(nota * 10) / 10);
            System.out.println("Truncada a las unidades: " + (int) nota);
            System.out.println();
        }

        System.out.println("Media: " + (suma / 5));
        System.out.println("Nota máxima: " + maximo);
        System.out.println("Nota mínima: " + minimo);

        sc.close();
    }
}