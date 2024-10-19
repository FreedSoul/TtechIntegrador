package ejercicio1;

import java.util.Scanner;

public class CalcularNotaEstudiante {
    public static void calificarEstudiante(){
        float calificacion1,calificacion2, calificacion3,calificacion4,totalCalificacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es la 1era nota");
        calificacion1 = scanner.nextFloat();
        System.out.println("cual es la 2da nota");
        calificacion2 = scanner.nextFloat();
        System.out.println("cual es la 3era nota");
        calificacion3 = scanner.nextFloat();
        System.out.println("cual es la 4ta nota");
        calificacion4 = scanner.nextFloat();
        calificacion1 = calificacion1 * 0.30f;
        calificacion2 = calificacion2 * 0.20f;
        calificacion3 = calificacion3 * 0.10f;
        calificacion4 = calificacion4 * 0.40f;
        totalCalificacion = calificacion1 + calificacion2 + calificacion3 + calificacion4;
        System.out.println("el resultado final para este estudiante es de "+ totalCalificacion);
    }
}
