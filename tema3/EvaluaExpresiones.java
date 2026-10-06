public class EvaluaExpresiones {
    public static void main(String[] args) {
        int a, b, c;

        // Mostramos en pantalla
        System.out.print("Este programa te evalua varias expresiones.");
        System.out.println("===========================================");

        // Primera expresión
        a = 2; b = 5;
        System.out.print("3 * A + B - 6 / A = ");
        System.out.println(3 * a + b - 6 / a);

        // Segunda expresión
        a = 4; b = 5; c = 1;
        System.out.print("B * A - B * B / 4 * C = ");
        System.out.println(b * a - b * b / 4 * c);

        // Tercera expresión
        a = 4; b = 5;
        System.out.print("(A * B) / 9 = ");
        System.out.println((a * b) / 9);

        // Cuarta expresión
        a = 4; b = 5; c = 1;
        System.out.print("(((B + C) / 2 * A + 10) * 3 * B) - 6 = ");
        System.out.println((((b + c) / 2 * a + 10) * 3 * b) - 6);

        // Quinta expresión
        a = 4; c = 1;
        System.out.print("3 > A && !C / 2 == 0.5 = ");
        // Esta expresión da error porque ! solo funciona con booleanos

        // Sexta expresión
        a = 4; b = 2; c = 20;
        System.out.print("(A + B) / 2 >= 3 || C != 20 = ");

        // Séptima expresión
        System.out.print("5 + 25 % 2 = ");
        System.out.println(5 + 25 % 2);

        // Octava expresión
        System.out.print("(5 + 25) % 2 = ");
        System.out.println((5 + 25) % 2);

        // Novena expresión
        System.out.print("5 + 25 / 10 = ");
        System.out.println(5 + 25 / 10);

        // Décima expresión
        System.out.print("-2 * 2 = ");
        System.out.println(-2 * 2);

        // Undécima expresión
        System.out.print("(-2) * 2 = ");
        System.out.println((-2) * 2);

        // Duodécima expresión
        System.out.print("-(2 * 2) = ");
        System.out.println(-(2 * 2));

        // Decimotercera expresión
        System.out.print("-Math.pow(2, 2) = ");
        System.out.println(-Math.pow(2, 2));

        // Decimocuarta expresión
        System.out.print("Math.pow(-2, 2) = ");
        System.out.println(Math.pow(-2, 2));

        // Decimoquinta expresión
        System.out.print("-Math.pow(2, 2) = ");
        System.out.println(-(Math.pow(2, 2)));
    }
}
