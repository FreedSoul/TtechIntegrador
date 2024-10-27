package Semana2.ejercicio4;

import java.util.Scanner;

//Elabore un algoritmo que calcule una tabla N de multiplicar
// que inicia el multiplicando con un valor X hasta un valor Y
public class MainTablaN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese que la tabla de que numero desea ver");
        int tabladel = sc.nextInt();
        System.out.println("Ingrese el factor inicial: ");
        int desde = sc.nextInt();
        System.out.println("Ingrese el factor final");
        int hasta = sc.nextInt();
        TablaN tabla = new TablaN(tabladel,desde,hasta);
        int[] tablaConstruida = tabla.listarDeXAY();
        System.out.println("la tabla del "+tabladel+" desde "+desde+" hasta "+hasta+" es :");
//        for (int i = 0; i < tablaConstruida.length; i++) {
//            System.out.println("- "+tabladel+"X"+i*+" = "+tablaConstruida[i]);
//        }
    }
}
