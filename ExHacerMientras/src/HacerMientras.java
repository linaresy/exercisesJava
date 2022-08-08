import  java.util.Scanner;
public class HacerMientras {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        System.out.println("<<<<< TEST HACIENDO MIENTRAS >>>>>>");
        System.out.println();
        System.out.print("Digite el numero hasta el que quieres contar: ");
        int extremomax = Integer.parseInt(capturar.nextLine());
        int contador = 1;
        do {
            System.out.println(contador);
            contador = contador + 1;
        } while (contador <= extremomax);
    }
}