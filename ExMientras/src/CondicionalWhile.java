import java.util.Scanner;
public class CondicionalWhile {
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        System.out.println("<<<<< PROBANDO CICLO WHILE >>>>>");
        System.out.println();

        System.out.print("Ingrese el conteo regresivo: ");
        int conteo = capturar.nextInt();

        while (conteo > 0){
            System.out.println(conteo);
            conteo--;
        }
    }
}