package ejercicio10;

import java.text.NumberFormat;
import java.util.*;

public class AlquilarCarros {
    Locale colombia = new Locale("es","CO");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(colombia);
    public Map<String, Double> RentableCars = new LinkedHashMap<>();
    public int rentedDays;
    public int carChoice;
    public String selectedCar;
    public float tenDiscount;
    public float fifteenDiscount;
    public float twentyDiscount;
    public float insurance;
    public String auxInsurance;
    public boolean getInsurance;
    public double total;

    public AlquilarCarros(){
        RentableCars.put("BMW", 650000.0);
        RentableCars.put("MEGANE", 120000.0);
        RentableCars.put("MERCEDES", 700000.0);
        RentableCars.put("TWINGO", 100000.0);
        RentableCars.put("AVEO", 150000.0);
        this.insurance = 0.05f;
        this.twentyDiscount = 0.20f;
        this.fifteenDiscount = 0.15f;
        this.tenDiscount = 0.10f;
        this.total = 0;
//        this.getInsurance = false;
    }

    public void calcularAlquilarAuto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos dias se rento el auto?");
        rentedDays = sc.nextInt();
        System.out.println("Cual tipo de auto rentó?");
        System.out.println("1. BMW");
        System.out.println("2. MEGANE");
        System.out.println("3. MERCEDES");
        System.out.println("4. TWINGO");
        System.out.println("5. AVEO");
        carChoice = sc.nextInt();
        sc.nextLine();
        System.out.println("Contrató seguro del auto? [si o no]");
        auxInsurance = sc.nextLine().trim().toLowerCase();
        getInsurance = auxInsurance.equalsIgnoreCase("si");
        ArrayList<String> listCars = new ArrayList<>(RentableCars.keySet());
        selectedCar = listCars.get(carChoice-1);
//        System.out.println(RentableCars.get(selectedCar));
        if (rentedDays>=3 && rentedDays<=5){
            total = rentedDays * RentableCars.get(selectedCar);
            total -= (tenDiscount*total);
        } else if (rentedDays>=6 && rentedDays<=10) {
            total = rentedDays * RentableCars.get(selectedCar);
            total -= (fifteenDiscount*total);
        } else {
            total = rentedDays * RentableCars.get(selectedCar);
            total -= (twentyDiscount*total);
        }
        if(getInsurance){
            total += (insurance*total);
            String formattedTotal = currencyFormatter.format(Math.round(total));
            System.out.println("el total mas cobro del seguro es: " + formattedTotal);
        }else{
            String formattedTotal = currencyFormatter.format(Math.round(total));
            System.out.println("el total sin cobro de insurance es: " + formattedTotal);
        }
    }
}
