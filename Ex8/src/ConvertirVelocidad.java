import java.util.Scanner;
public class ConvertirVelocidad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<< ------- CONVERTIDOR VELOCIDADES (Km/h a m/s) ------->>>");
        System.out.println();
        System.out.print("Ingrese los Km/h a convertir >>> ");
        float kilometros = in.nextFloat();
        //Calculo de Km
        double kmams = (0.277778);
        double resultado = kilometros * kmams;
        System.out.println(kilometros + " equivalen a " + resultado + " m/s.");
    }
}