package Semana2.ejercicio6;
//Elabore un algoritmo que calcule e imprima cuántos y cuáles son los números
// primos hay dentro de un rango dado por el usuario.


import java.util.ArrayList;
import java.util.Scanner;

public class MainPrimos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Da el rango inicial para evaluar cuales son primos");
        int rangeInicial = sc.nextInt();
        System.out.println("Da el valor final para evaluar cuales son primos");
        int rangeFinal = sc.nextInt();
        Primos primos = new Primos(rangeInicial, rangeFinal);
        ArrayList<Integer> res = primos.evaluarPrimos();
        res.forEach(n->System.out.print(n+", "));
    }
}
