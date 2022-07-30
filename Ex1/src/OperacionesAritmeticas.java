import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        //Variables locales
        Scanner in = new Scanner(System.in);

        System.out.println("<<---- Operaciones Aritmeticas ------>>");
        System.out.println();
        System.out.println("Digite el primer numero utilizado en la operacion: ");
        int a = in.nextInt();
        System.out.println("Digite el segundo numero utilizado en la operacion: ");
        int b = in.nextInt();
        System.out.println(">>>> Calculando operaciones...");
        // Operaciones
        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + ", es igual = " + suma);

        int resta = a - b;
        System.out.println("La resta de " + a + " - " + b + ", es igual = " + resta);

        int multiplicacion = a * b;
        System.out.println("La multiplicacion de " + a + " x " + b + ", es igual = " + multiplicacion);

        int division = a / b;
        System.out.println("La division de " + a +" / " + b +", es igual = " + division);


    }
}
