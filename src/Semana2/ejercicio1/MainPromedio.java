package Semana2.ejercicio1;

import java.util.Scanner;

public class MainPromedio{
    public static void main(String[] args) {
        Promedio prom = new Promedio();
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea evaluar?");
        int cantNumeros = scanner.nextInt();
        System.out.println("El promedio es: "+prom.resultadoPromedio(cantNumeros));
    }
}
