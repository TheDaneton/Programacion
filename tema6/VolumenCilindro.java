package tema6;
public class VolumenCilindro {

    public static void volumenCilindro(double radio, double altura) {
        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static void main(String[] args) {
        volumenCilindro(5, 10);
    }
}