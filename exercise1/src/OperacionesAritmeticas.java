import java.util.Scanner;
class OperacionesAritmeticas {
    public static void main(String[] args) {
        //Variables locales
        int suma; int resta; int división; int multiplicación;
        Scanner in = new Scanner(System.in);

        System.out.println("<<---- Operaciones Aritméticas ------>>");
        System.out.println();
        System.out.println("Digite el primer número utilizado en la operación: ");
        int a = in.nextInt();
        System.out.println("Digite el segundo número utilizado en la operación: ");
        int b = in.nextInt();
        System.out.println(">>>> Calculando operaciones...");
        // Operaciones
        suma = a + b;
        System.out.println("La suma de a= " + a " y b= " + b ", es igual = " + suma);

        resta = a - b;
        System.out.println("La resta de a= " + a " - b= " + b ", es igual = " + resta);

        multiplicación = a * b;
        System.out.println("La multiplicación de a= " + a " x b= " +b ", es igual = "+ multiplicación);

        división = a / b;
        System.out.println("La división de a= " + a " / b= " + b ", es igual = " + división);


    }
}