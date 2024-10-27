package Semana2.ejercicio1;

import java.util.Scanner;

public class Promedio {
    public float acum = 0;

    public float resultadoPromedio(int cuantas){
        float resultado=0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < cuantas; i++) {
            System.out.println("Ingrese el valor: ");
            float valor = scanner.nextFloat();
            acum += valor;
        }
        resultado = acum / cuantas;
        return resultado;
    }
}
