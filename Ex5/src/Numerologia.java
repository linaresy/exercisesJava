import java.util.Random;
public class Numerologia {
    public static void main(String[] args) {

        System.out.println("<<<-------- FUNCIONES MATEMATICAS -------->>>");
        System.out.println();
        System.out.println("Generando entero aleatorio >>> " + GenerarEntero(100000000));
        System.out.println("Generando entero aleatorio entre rango de 10 a 20 >>> " + GenerarEnteroRango(10,20));
        System.out.println("Generando decimal aleatorio entre 10 a 20 >>> " + GenerarDecimalRango(10 ,20));
        System.out.println();
        System.out.println("- LP Corp Software - |2022| ");
    }

    public static int GenerarEntero (int aleatorio){
        Random random = new Random();
        return random.nextInt(aleatorio);
    }
    //Generar entero entre rango de 10 a 20
    public static int GenerarEnteroRango(int minimo, int maximo){
        Random r = new Random();
        return r.nextInt((maximo-minimo)+1)+minimo;
    }
    //Generar decimal entre rangos de 10 a 20
    public static float GenerarDecimalRango (float min, float max){
        Random d = new Random();
        return d.nextFloat((max-min)+1)+min;
    }

}