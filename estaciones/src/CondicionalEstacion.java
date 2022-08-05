import java.util.Scanner;
public class CondicionalEstacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<< PROGRAMA ESTACIONES DEL AÑO>>>>>");
        System.out.println();
        System.out.println("Indique la estacion: ");
        String estacion = sc.nextLine();
        estacion = estacion.toUpperCase();

        if (estacion .equals("PRIMAVERA")){
            System.out.println("La estacion es " + estacion);
        } else {
            System.out.println("Es otra estacion.");
        }

    }
}