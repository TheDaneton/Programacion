import java.util.Scanner;

public class EJ2_1 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce las horas trabajadas: ");
        float horas = teclado.nextFloat();
        
        float salario = horas * 12;
        
        System.out.println("El salario semanal es: " + salario + " euros");
        
        teclado.close();
    }
}