package Semana1.ejercicio9;

import java.util.Scanner;

public class ProveedorEstereos {
    public float discount;
    public float discountNosy;
    public boolean isBrandNosy;
    public String aux;
    public double price;
    public double subtotal;
    public double total;
    public double iva;

    public ProveedorEstereos(){
        this.discount=0.1f;
        this.discountNosy = 0.05f;
        this.subtotal = 0;
        this.total = 0;
        this.price = 0;
    }
    public void calculateFinalPrice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto vale el producto?");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("la marca del producto es Nosy? [si o no]");
        aux = sc.nextLine();
        isBrandNosy = aux.trim().equalsIgnoreCase("si");
        iva = 0.19f * price;
        if(price>2000){
            subtotal = price - (price*discount);
        }
        subtotal += iva;
        if(isBrandNosy){
            subtotal -= (price*discountNosy);
        }
        total = subtotal;
        System.out.println("el valor a pagar es: "+ total);
    }
}
