package ejercicio5;

import java.util.Scanner;

public class CobroParqueo {
    public int hourlyRate;
    public double cobroTotal;
    public int hours;
    public int minutes;

    public CobroParqueo(){
        this.hourlyRate = 1500;
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas Horas lleva estacionado?");
        this.hours = sc.nextInt();
        System.out.println("cuantos minutos lleva estacionado?");
        this.minutes = sc.nextInt();

    }

    public void calcularCobroParqueo(){
        if (minutes>0) hours++;
        cobroTotal = hours * hourlyRate;
        System.out.println("El precio a pagar por estacionar "+ hours +" hora/s es de: $"+ cobroTotal);
    }

}
