package Semana2.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMayorMenor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MayorMenor mom = new MayorMenor();
        System.out.println("cuantos numeros desea evaluar?");
        int cantDatos = sc.nextInt();
//        otra maner de instanciar una lista, esta es para una lista dinamica y con mas metodos
//        ArrayList<Integer> listaEvaluar = new ArrayList<>(cantDatos);
        int[] listaEvaluar = new int[cantDatos];
        int i = 0;
        while (i < cantDatos){
            System.out.print("Ingrese un numero mas en la lista: ");
            listaEvaluar[i] = sc.nextInt();
            i++;
        }
        int mayor = mom.calcularMayor(listaEvaluar);
        int menor = mom.calcularMenor(listaEvaluar);
        System.out.println("el numero mayor es: "+mayor);
        System.out.println("el numero menor es: "+menor);
    }
}
