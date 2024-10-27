package Semana2.ejercicio7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Sueldos {
    public float salario;
    public int nVendedores;

    public Sueldos(float salario, int nVendedores) {
        this.salario = salario;
        this.nVendedores = nVendedores;
    }

    public Optional<Vendedor> calcularSueldo(ArrayList<Vendedor> listaVendedores){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nVendedores; i++) {
            sc.nextLine();
            System.out.println("Ingresa el nombre del vendedor: ");
            String nombre = sc.nextLine();
            System.out.println("Cuantos Autos vendio? ");
            int cantVendidos = sc.nextInt();
            double[] precioAutos = new double[cantVendidos];
            for (int j = 0; j < cantVendidos; j++) {
                System.out.println("cual es el precio del Auto vendido numero "+(j+1)+"? ");
                precioAutos[j] = sc.nextFloat();
            }
            double[] porcentajeVenta = Arrays.stream(precioAutos).map(n-> n * 0.02f).toArray();
            double sumPorcVenta = Arrays.stream(porcentajeVenta).reduce(0, Double::sum);
//            System.out.println("sumatoria porcentaje de venta"+sumPorcVenta);
            double totalSueldo = (double) Math.round(sumPorcVenta+salario);
            Vendedor vendedor = new Vendedor(nombre,totalSueldo);
            listaVendedores.add(i, vendedor);
        }
        //        mayorEnVentas.ifPresent(maxVal -> System.out.println("el vendedor con mas ventas fue "+maxVal.nombre()+" su sueldo es: "+maxVal.sueldoCalculado()));
        return listaVendedores.stream()
                .reduce((vendedor, vendedor2) -> vendedor.sueldoCalculado() > vendedor2.sueldoCalculado() ? vendedor : vendedor2);
    }
}
