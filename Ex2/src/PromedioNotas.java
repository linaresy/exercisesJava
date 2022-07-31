import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("<<<<----- PROGRAMA PROMEDIO DE NOTAS ------>>>>");
        System.out.println("");
        System.out.println("...A continuacion registre los datos solicitados:");
        System.out.println("");
        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = in.nextLine();
        System.out.print("Primera Nota: ");
        float nota1 = in.nextFloat();
        System.out.print("Segunda Nota: ");
        float nota2 = in.nextFloat();
        System.out.print("Tercera Nota: ");
        float nota3 = in.nextFloat();

        float promedio = ( nota1 + nota2 + nota3 ) / 3;

        System.out.println("El promedio de notas del estudiante " + nombres + " es de: " + promedio);

    }
}