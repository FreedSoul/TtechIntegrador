package Semana2.ejercicio8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DescClientes {
    HashMap<Integer, Float> tipos;
    ArrayList<Cliente> listaClientes;

    public DescClientes(){
        this.tipos = new HashMap<>();
        tipos.put(1,0.05f);
        tipos.put(2,0.08f);
        tipos.put(3,0.12f);
        tipos.put(4,0.15f);
    }
    public ArrayList<Cliente> calcListaClientes(int cantClientes, float precioUnidad){
        Scanner sc = new Scanner(System.in);
        this.listaClientes = new ArrayList<>();
        for (int i = 0; i < cantClientes; i++) {
            System.out.println("¿Cual es el nombre del cliente?");
            String nombreCliente = sc.nextLine();
            //arreglar bugg para tomar bien valores
            sc.nextLine();
            System.out.println("¿Que tipo de cliente es?: 1)Tipo1 2)Tipo2 3)Tipo3 4)Tipo4");
            int tipoCliente = sc.nextInt();
            System.out.println("¿Cantidad de hojas compradas?(unidades)");
            int cantUnidades = sc.nextInt();
            double subTotal = cantUnidades * precioUnidad;
            double totalyDesc = subTotal-(subTotal*tipos.get(tipoCliente));
            Cliente cliente = new Cliente(nombreCliente, tipoCliente, cantUnidades, precioUnidad, totalyDesc);
            listaClientes.add(cliente);
        }

        return listaClientes;
    }
}
