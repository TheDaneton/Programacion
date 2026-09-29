import java.util.Scanner;

public class EJ2_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de Mb: ");
        double mb = sc.nextDouble();
        
        double kb = mb * 1024;
        
        System.out.println("La cantidad en Kb es: " + kb);
        
        sc.close();
    }
}
