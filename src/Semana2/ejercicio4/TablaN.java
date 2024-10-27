package Semana2.ejercicio4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TablaN {
    private int tablaN;
    private int desdeX;
    private int hastaY;

    public TablaN(int tablaN, int desdeX, int hastaY) {
        this.tablaN = tablaN;
        this.desdeX = desdeX;
        this.hastaY = hastaY;
    }

    public int[] listarDeXAY() {
        int sizeTabla = hastaY - desdeX + 1;
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
        int[] listaFactores = IntStream.range(0,sizeTabla).map(i->desdeX+i).toArray();
        int[] listaRes = Arrays.stream(listaFactores).map(n -> n * tablaN).toArray();
        for (int i = 0; i < listaFactores.length; i++) {
            System.out.println(STR."- \{tablaN} X \{listaFactores[i]} = \{listaRes[i]}");
        }
        return listaFactores;
    }
}
