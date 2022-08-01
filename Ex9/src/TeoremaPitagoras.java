import java.util.*;
public class TeoremaPitagoras {
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        System.out.println("<<<--------- TEOREMA DE PITAGORAS --------->>>");
        System.out.println();
        System.out.print("Ingrese el valor del cateto a: ");
        float cata = cap.nextFloat();
        System.out.print("Ingrese valor de cateto b: ");
        float catb = cap.nextFloat();
        // Calcular teorema de pitagoras
        float resultadotp = (float) Math.sqrt((Math.pow(cata,2)+Math.pow(catb,2)));
        System.out.println("El valor de la Hipotenusa hallada es = " + resultadotp);

    }
}