package Semana2.ejercicio3;

import java.util.Arrays;

public class MayorMenor {

    public int calcularMayor(int[] numerosUsuario){
        Arrays.sort(numerosUsuario);
        int mayor = numerosUsuario[numerosUsuario.length-1];
        return mayor;
    }
    public int calcularMenor(int[] numerosUsuario){
        Arrays.sort(numerosUsuario);
        int menor = numerosUsuario[0];
        return menor;
    }
}
