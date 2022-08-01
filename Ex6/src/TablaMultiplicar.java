import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("<<<< ------- TABLAS DE MULTIPLICAR ------- >>>>!");
        System.out.println();
        System.out.print("Elija una tabla de multiplicar >>> ");
        int tabla = in.nextInt();
        int resultado1 = tabla * 1;
        int resultado2 = tabla * 2;
        int resultado3 = tabla * 3;
        int resultado4 = tabla * 4;
        int resultado5 = tabla * 5;
        int resultado6 = tabla * 6;
        int resultado7 = tabla * 7;
        int resultado8 = tabla * 8;
        int resultado9 = tabla * 9;
        int resultado10 = tabla * 10;
        System.out.println(tabla + " * 1 = " + resultado1);
        System.out.println(tabla + " * 2 = " + resultado2);
        System.out.println(tabla + " * 3 = " + resultado3);
        System.out.println(tabla + " * 4 = " + resultado4);
        System.out.println(tabla + " * 5 = " + resultado5);
        System.out.println(tabla + " * 6 = " + resultado6);
        System.out.println(tabla + " * 7 = " + resultado7);
        System.out.println(tabla + " * 8 = " + resultado8);
        System.out.println(tabla + " * 9 = " + resultado9);
        System.out.println(tabla + " * 10 = " + resultado10);
    }
}