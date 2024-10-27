package Semana2.calculadora;

public class Calculadora {
    private float a;
    private float b;
    public Calculadora(float a, float b){
        this.a = a;
        this.b = b;
    }
    public float sumar(){
        return a+b;
    }
    public float restar(){
        return a-b;
    }
    public float multiplicar(){
        return a*b;
    }
    public float dividir(){
        return a/b;
    }

}
