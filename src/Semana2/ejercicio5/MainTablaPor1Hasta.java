package Semana2.ejercicio5;

import java.util.Scanner;
//5- Elabore un algoritmo que calcule e imprima las tablas de multiplicar desde uno hasta un numero dado por el usuario
// , el multiplicador desde uno hasta un numero dado por el usuario.
public class MainTablaPor1Hasta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la tabla hasta la que desea ver");
        int del1hasta = sc.nextInt();
        TablaPor1Hasta tabla = new TablaPor1Hasta();
        tabla.setHastaX(del1hasta);
        int[][] tablaCompleta = tabla.listarDe1AY();
        for (int i = 0; i < tablaCompleta.length; i++) {
            int onePlusI = 1+i;
            for (int j = 0; j < tablaCompleta[i].length; j++) {
                int onePlusJ = 1+j;
                System.out.print(onePlusI+"X"+onePlusJ+"="+ tablaCompleta[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
