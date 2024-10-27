package Semana2.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDescClientes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos clientes han comprado en el momento?");
        int cantClientes = sc.nextInt();
        System.out.println("¿Cual es el precio unitario de una hoja");
        float precioUnitario = sc.nextFloat();
        DescClientes descClientes = new DescClientes();
        ArrayList<Cliente> listaClientes = descClientes.calcListaClientes(cantClientes, precioUnitario);
        String imprimirLista= """
                ----------------------------------------------------------
                •Nombre del cliente:%s
                •Tipo de cliente:%d
                •cantidad de hojas compradas:%d
                •Precio por hoja:%.2f
                •Precio total con descuento:%.2f
                ----------------------------------------------------------
               """;
        listaClientes.forEach(c ->
                        System.out.print(
                               String.format(imprimirLista,
                                       c.name(),c.clientType(),c.cantComprada(),c.precioUnit(),c.precioTotal()
                               )
                        ));

    }
}
