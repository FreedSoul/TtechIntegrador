package Semana2.ejercicio2;

public class MainColegio {
    public static void main(String[] args) {

        ColegioRobles col = new ColegioRobles(750);
        float res = col.calcularCrecimiento();
        System.out.println("la poblacion estudiantil para el anio 2035 es de: "+ res);

    }
}
