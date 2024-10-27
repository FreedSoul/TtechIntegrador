package Semana2.ejercicio6;

import java.util.ArrayList;

public class Primos {
    private int rInicial;
    private int rFinal;

    public Primos(int rInicial, int rFinal) {
        this.rInicial = rInicial;
        this.rFinal = rFinal;
    }

    public ArrayList<Integer> evaluarPrimos(){
//        int sizeRango = rFinal - rInicial;
        ArrayList<Integer> rangoPrimos = new ArrayList<>();
        for (int i = rInicial; i <= rFinal; i++) {
            if(esPrimo(i)) {
                rangoPrimos.add(i);
            }
        }
        return rangoPrimos;
    }
    
    public boolean esPrimo(int numero){
        for (int i = 2; i <= numero; i++) {
            if (numero%i == 0 && numero != i){
                return false;
            }
        }
        return true;
    }

}
