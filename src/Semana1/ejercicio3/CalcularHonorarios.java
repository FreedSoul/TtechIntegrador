package Semana1.ejercicio3;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CalcularHonorarios {
    Locale colombia = new Locale("es","CO");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(colombia);
//    String formattedPrice = currencyFormatter.format()
    public BigDecimal HourlyRate;
    public BigDecimal healthPercent;
    public BigDecimal retirementPercent;

    public CalcularHonorarios(){
        this.healthPercent = new BigDecimal("0.125");
        this.retirementPercent = new BigDecimal("0.16");
        this.HourlyRate = new BigDecimal("75000");
    }

    public void calcularPagoEmpleado(){
        String hoursWorked;
        BigDecimal hoursWorkedDecimal;
        BigDecimal totalPayment;
        BigDecimal subtotal;
        BigDecimal totalPaymentHealth;
        BigDecimal totalPaymentRetirement;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantas son las horas trabajadas en el mes de septiembre?");
        hoursWorked = scanner.nextLine();
        hoursWorkedDecimal = new BigDecimal(hoursWorked);

        subtotal = HourlyRate.multiply(hoursWorkedDecimal);
        System.out.println("el pago total sin deducciones es: $"+subtotal);
        totalPaymentHealth = subtotal.multiply(healthPercent);
        System.out.println("un 12.5% para pago a Salud: $" + totalPaymentHealth);
        totalPaymentRetirement = subtotal.multiply(retirementPercent);
        System.out.println("un 16% para pago a Pension: $" + totalPaymentRetirement);
        totalPayment = subtotal.subtract(totalPaymentHealth).subtract(totalPaymentRetirement);
        String formattedPrice = currencyFormatter.format(totalPayment);
        System.out.println("el pago total con deducciones es: "+formattedPrice);


    }
}
