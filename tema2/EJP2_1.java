import java.util.Scanner;
public class EJP2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int segundos;
            int minutos;
            int horas;
            int segundosRestantes;
            System.out.println("Calcula el nº de minutos y segundos, dada una cantidad de segundos");
            System.out.println("Escriba la cantidad de segundos");
            segundos = sc.nextInt();
            //ESTO TE ESCANEA LA CANTIDAD DE SEGUNDOS INTRODUCIDOS.
            segundosRestantes = segundos % 60;
            minutos = segundos / 60;
            //ESTO CONVIERTE LOS SEGUNDOS EN MINUTOS.
            horas = minutos / 60;
            //ESTO CONVIERTE MINUTOS EN HORAS.
            minutos = minutos % 60;
            if (horas > 0)  {
                System.out.println("El número de segundos que has puesto son: " + horas + " horas, " + minutos + " minutos y " + segundosRestantes + " segundos.");
            } else {
                System.out.println("El número de segundos que has puesto son: " + minutos + " minutos y " + segundosRestantes + " segundos.");
            }
            
            sc.close();

    }
}