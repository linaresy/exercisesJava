import java.util.Scanner;
public class LongitudTexto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<<-------- PROGRAMA LONGITUD DE TEXTO -------- >>>>");
        System.out.println();
        System.out.print("Ingrese el texto a analizar >>> ");
        String texto = in.nextLine();
        int LongitudTexto = texto.length();

        System.out.println("El texto ingresado tiene una longitud de " + LongitudTexto + " caracteres.");
        String textointerno = "Paranguitilimicuaro";
        int LongitudTextInterno = textointerno.length();
        System.out.println("Para el texto interno: " + textointerno + " la longitud es de " + LongitudTextInterno + " caracteres.");
    }
}