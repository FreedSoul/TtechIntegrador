package ejercicio4;

import java.util.HashMap;
import java.util.Scanner;

public class CalcularSalario {
    //por teclado
    public double monthlyBaseSalary;
    public boolean extraHours;
    public int absenceDays;
    public String answer;
    public int extraDiurna;
    public int extraDomin;
    public int extraNoct;
    public int extraFest;
    public float healthPercent;
    public float retirementPercent;

    HashMap<Extras, Float> percentHours = new HashMap<>();

    enum Extras{
        Diurnas,//25%
        Dominicales,//100%
        Nocturnas,//35%
        Festivas,//75%
    }

    public CalcularSalario(){
        this.healthPercent = 0.04f;
        this.retirementPercent = 0.04f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuanto es el salario base mensual?");
        this.monthlyBaseSalary = scanner.nextDouble();
        System.out.println("cuantos dias falto en el mes?");
        this.absenceDays = scanner.nextInt();
        System.out.println("trabajo horas extras en el mes? ");
        while(true){
            answer = scanner.nextLine().trim().toLowerCase();
//            System.out.println("answer="+answer);
            if (answer.equals("si")){
                this.extraHours = true;
                break;
            } else if (answer.equals("no")){
                this.extraHours = false;
                break;
            } else {
                System.out.println("Debes responder SI o NO para poder continuar");
            }
        }
        if (extraHours) {
            System.out.println("cuantas horas extras Diurnas trabajó en el mes?");
            this.extraDiurna = scanner.nextInt();
            System.out.println("cuantas horas extras Dominicales trabajó en el mes?");
            this.extraDomin = scanner.nextInt();
            System.out.println("cuantas horas extras Nocturnas trabajó en el mes?");
            this.extraNoct = scanner.nextInt();
            System.out.println("cuantas horas extras Festivas trabajó en el mes?");
            this.extraFest = scanner.nextInt();
            percentHours.put(Extras.Diurnas,0.25f);
            percentHours.put(Extras.Dominicales,1f);
            percentHours.put(Extras.Nocturnas,0.35f);
            percentHours.put(Extras.Festivas,0.75f);
        }

    }

    public void calcularSalarioHorasExtras(){
        double subtotalConFaltas;
//        double subtotalConExtras;
        double sumatoriaExtras = 0;
        double healthPayment;
        double retirementPayment;
        double dailyRate;
        double hourlyRate;
        double total;

        dailyRate = monthlyBaseSalary / 30;
        hourlyRate = dailyRate / 8;
        subtotalConFaltas = monthlyBaseSalary - (dailyRate * absenceDays);
        if(extraHours){
            sumatoriaExtras = sumatoriaExtras(hourlyRate);
//            subtotalConExtras = monthlyBaseSalary + sumatoriaExtras;
        }
        total = subtotalConFaltas + sumatoriaExtras;
        healthPayment = healthPercent * total;
        System.out.println("un 4% del monto es destinado a salud: "+ healthPayment);
        retirementPayment = retirementPercent * total;
        System.out.println("un 4% del monto es destinado a pension: "+ retirementPayment);
        total = total - healthPayment - retirementPayment;
        System.out.println("su pago correspondiente a este mes es: " + total);
    }

    public double sumatoriaExtras(double hourlyRate){
        double sumandoExtras = 0;
        if(extraFest!=0){
            sumandoExtras += extraFest * percentHours.get(Extras.Festivas) * hourlyRate;
        }
        System.out.println("sumando extras Festivas"+ sumandoExtras);
        if(extraNoct!=0){
            sumandoExtras += extraNoct * percentHours.get(Extras.Nocturnas) * hourlyRate;
        }
        System.out.println("sumando extras Nocturnas"+ sumandoExtras);
        if(extraDomin!=0){
            sumandoExtras += extraDomin * percentHours.get(Extras.Dominicales) * hourlyRate;
        }
        System.out.println("sumando extras Dominicales"+ sumandoExtras);
        if(extraDiurna!=0){
            sumandoExtras += extraDiurna * percentHours.get(Extras.Diurnas) * hourlyRate;
        }

        return sumandoExtras;
    }
}
