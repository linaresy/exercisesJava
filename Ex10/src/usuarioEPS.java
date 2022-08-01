import java.util.Scanner;
public class usuarioEPS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<<-------- INFORMACION DE USUARIO -------- >>>>>");
        System.out.println();
        System.out.print("Nombres del usuario: ");
        String nombre = in.nextLine();
        System.out.print("Apellidos del usuario: ");
        String apellido = in.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(in.nextLine());

        System.out.print("Genero (M-Masculino | F-Femenino) >>> ");
        char genero = in.nextLine().charAt(0);

        System.out.print("Valor del sueldo: $ ");
        int sueldo = Integer.parseInt(in.nextLine());

        System.out.print("Indique si tiene EPS (SI | NO) >>> ");
        String eps = in.nextLine();

        System.out.println();
        System.out.println("---------------- <<< Informacion capturada >>> ----------------");

        System.out.println("Tu(s) nombre(s) es: " + nombre);
        System.out.println("Tu(s) apellido(s) es: " + apellido);
        System.out.println("Tu edad es: " + edad);
        System.out.println("Tu genero es: " +genero);
        System.out.println("Tu ultimo salario fue de $: " + sueldo);
        System.out.println("Tiene EPS? "+ eps);

    }
}