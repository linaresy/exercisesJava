import java.util.Scanner;
public class CalcularSueldo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<-------------- PROGRAMA CALCULO DE SUELDO -------------->>>");
        System.out.println("");
        System.out.println("..............................................................");
        System.out.println(". Para calcular el sueldo registre la informacion solicitada .");
        System.out.println("..............................................................");
        System.out.println("");
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre_empleado = in.nextLine();

        System.out.println("¿Cuantas horas mensuales trabajo el empleado " + nombre_empleado + "?");
        int horas_trabajadas = in.nextInt();
        // Calcular sueldo
        int salario_hora = 10000;
        int sueldo = salario_hora * horas_trabajadas;
        System.out.println("El salario mensual a recibir es de $"+ sueldo + "COP.");
    }
}