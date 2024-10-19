package ejercicio6;

import java.util.Locale;
import java.util.Scanner;

public class SupermercadoDescuento {
    public int purchasedProducts;
    public float price;

    public SupermercadoDescuento(){
        Locale colombia = new Locale("es","CO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos se van a comprar?");
        this.purchasedProducts = sc.nextInt();
        System.out.println("Cuanto vale el producto?");
        this.price = sc.nextFloat();
    }
    public void calcularCobroDescuento(){
        float discount = 0;
        int giftProduct = 0;
        double cobroTotal = 0;
        double subtotal = 0;
        if(purchasedProducts>36){
            discount = 0.15f;
//            giftProduct = (purchasedProducts-36) / 12);
            giftProduct = (int)(purchasedProducts-36) / 12;
        }else{
            discount = 0.1f;
        }
        subtotal = price * purchasedProducts;
        cobroTotal = subtotal - (discount * subtotal);
        System.out.println("El precio a pagar por "+ purchasedProducts +" productos");
        System.out.println("es de: "+ cobroTotal);
        System.out.println("Ademas regalamos otros "+ giftProduct +" productos como descuento");
    }
}
