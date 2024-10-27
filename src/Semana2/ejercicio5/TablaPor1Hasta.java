package Semana2.ejercicio5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TablaPor1Hasta {
    private int hastaX;
    private int size;

    public TablaPor1Hasta() {
        this.size = 10;
    }

    public void setHastaX(int hastaX){
        this.hastaX = hastaX;
    }

    public int[][] listarDe1AY() {
//        System.out.println(sizeTabla+"sizetabla");
//        usando ciclos for
//        int[] listaFactores = new int[sizeTabla];
//        for (int i = 0; i < sizeTabla; i++) {
//            listaFactores[i] = desdeX + i;
//        }
//        int[] listaRes = new int[sizeTabla];
//        for (int i = 0; i < listaRes.length; i++) {
//            listaRes[i] = listaFactores[i] * tablaN;
//        }
//        usando streams
        int[][] listaTablas = new int[hastaX][10];
        int[][] tabla = IntStream.range(1,hastaX+1)
                .mapToObj(n -> IntStream.range(1,11)
                .map(j->  n * j).toArray())
                .toArray(int[][]::new);

        return tabla;
    }
}
