package Semana2.calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el primer numero a operar ");
        float a = sc.nextInt();
        System.out.print("que operacion de desea hacer 1.suma 2.resta 3.multiplicacion 4.division");
        int operacion = sc.nextInt();
        System.out.print("ingrese el segundo numero a operar ");
        float b = sc.nextInt();
        Calculadora calculadora1 = new Calculadora(a,b);
        switch (operacion){
            case 1:
                float res = calculadora1.sumar();
                System.out.println("el resultado es: "+res);
                break;
            case 2:
                float res2 = calculadora1.restar();
                System.out.println("el resultado es: "+res2);
                break;
            case 3:
                float res3 = calculadora1.multiplicar();
                System.out.println("el resultado es: "+res3);
                break;
            case 4:
                float res4 = calculadora1.dividir();
                System.out.println("el resultado es: "+res4);
                break;
            default:
                System.out.println("error, haz elegido una opcion incorrecta");
        }

    }
}
