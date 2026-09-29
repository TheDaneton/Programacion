import java.util.Scanner;

public class EJ2_2 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el radio del cono: ");
        double radio = teclado.nextDouble();
        
        System.out.print("Introduce la altura del cono: ");
        double altura = teclado.nextDouble();
        
        double volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
        
        System.out.println("El volumen del cono es: " + volumen);
        
        teclado.close();
    }
}
