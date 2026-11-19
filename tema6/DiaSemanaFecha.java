package tema6;
import java.util.Scanner;

public class DiaSemanaFecha {

    static Scanner teclado = new Scanner(System.in);

    public static int LeeAñoValido() {
        int año;

        do {
            System.out.print("Introduce un año (desde 1583): ");
            año = teclado.nextInt();
        } while (año < 1583);

        return año;
    }

    public static int LeeMesValido(int año) {
        int mes;

        do {
            System.out.print("Introduce un mes (1-12): ");
            mes = teclado.nextInt();
        } while (mes < 1 || mes > 12);

        return mes;
    }

    public static int LeeDiaValido(int año, int mes) {
        int dia;
        int diasMes;

        if (mes == 2) {
            if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                diasMes = 29;
            } else {
                diasMes = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30;
        } else {
            diasMes = 31;
        }

        do {
            System.out.print("Introduce un día (1-" + diasMes + "): ");
            dia = teclado.nextInt();
        } while (dia < 1 || dia > diasMes);

        return dia;
    }

    public static int DiaSemana(int dia, int mes, int año) {
        int a;
        int b;
        int c;
        int n;

        if (mes == 1 || mes == 2) {
            a = mes + 10;
            b = (año - 1) % 100;
            c = (año - 1) / 100;
        } else {
            a = mes - 2;
            b = año % 100;
            c = año / 100;
        }

        n = (700 + (26 * a - 2) / 10 + dia + b + b / 4 + c / 4 - 2 * c) % 7;

        return n;
    }

    public static String DiaEnLetra(int nDia) {
        switch (nDia) {
            case 0:
                return "domingo";
            case 1:
                return "lunes";
            case 2:
                return "martes";
            case 3:
                return "miércoles";
            case 4:
                return "jueves";
            case 5:
                return "viernes";
            case 6:
                return "sábado";
            default:
                return "Día incorrecto";
        }
    }

    public static void main(String[] args) {
        int año;
        int mes;
        int dia;
        int nDia;

        año = LeeAñoValido();
        mes = LeeMesValido(año);
        dia = LeeDiaValido(año, mes);

        nDia = DiaSemana(dia, mes, año);

        System.out.println("La fecha es: " + dia + "/" + mes + "/" + año);
        System.out.println("El día de la semana es: " + DiaEnLetra(nDia));
    }
}