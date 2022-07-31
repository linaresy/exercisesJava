import java.util.Scanner;
public class AnalisisNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<<-------- PROGRAMA ANALISIS DE NUMEROS --------->>>>");
        System.out.println("");
        System.out.print("Ingrese un numero >>> ");
        int num1 = in.nextInt();
        System.out.print("Ingrese otro numero >>> ");
        int num2 = in.nextInt();
        // Calculo de operaciones requeridas...
        int doble_primero = num1 * num1;
        int doble_segundo = num2 * num2;

        System.out.println("El primer numero introducido es: " + num1);
        System.out.println("El segundo numero introducido es: " + num2);
        System.out.println();
        System.out.println("El doble del primer numero es: " + doble_primero);
        System.out.println("El doble del segundo numero es: " + doble_segundo);
    }
}