import java.util.Scanner;

public class EJ3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana: ");
        String dia = sc.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("A primera hora toca Lenguage de Marca.");
                break;
            case "martes":
                System.out.println("A primera hora toca Programación.");
                break;
            case "miércoles":
                System.out.println("A primera hora toca Base de Datos.");
                break;
            case "jueves":
                System.out.println("A primera hora toca Programación.");
                break;
            case "viernes":
                System.out.println("A primera hora toca Programación.");
                break;
            default:
                System.out.println("El día introducido no es válido.");
        }

        sc.close();
    }
}