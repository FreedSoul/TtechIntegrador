package Semana2.ejercicio7;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;


public class MainSueldos {

    public static void main(String[] args){
        Locale colombia = new Locale("es","CO");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(colombia);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Salario base de los vendedores");
        float salario = sc.nextFloat();
        System.out.println("Ingrese el cuantos vendedores se evaluaran");
        int cantVendedores = sc.nextInt();
        Sueldos sueldos = new Sueldos(salario, cantVendedores);
        ArrayList<Vendedor> listaVendedores = new ArrayList<>();
        Optional<Vendedor> mayorVendedor = sueldos.calcularSueldo(listaVendedores);
        mayorVendedor.ifPresent(maxVen -> System.out.println("el vendedor con mas ventas fue "+maxVen.nombre()+" su sueldo es: "+currencyFormatter.format(maxVen.sueldoCalculado())));
    }
}
