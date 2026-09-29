import java.util.Scanner;

public class EJ2_4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de Kb: ");
        double kb = teclado.nextDouble();
        
        double mb = kb / 1024;
        
        System.out.println("La cantidad en Mb es: " + mb);
        
        teclado.close();
    }
}
