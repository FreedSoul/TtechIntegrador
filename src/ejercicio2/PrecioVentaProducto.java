package ejercicio2;

import java.util.Scanner;

public class PrecioVentaProducto {
    public float costoProduccion;
    public float utility;
    public float taxes;

    public PrecioVentaProducto(){
        String costoProduccionInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cual es costo de produccion del producto");
        costoProduccionInput = scanner.nextLine();
        this.costoProduccion = Float.parseFloat(costoProduccionInput);
        this.utility = 1.2f;
        this.taxes = 0.15f;
    }

    public void calcularPrecioVenta(){
        float valorVentaPublico = 0;
        float valorConUtilidad = 0;
        float valorConImpuestos = 0;
        valorConUtilidad = costoProduccion * utility;
        valorConImpuestos = costoProduccion * taxes;
        valorVentaPublico = valorConUtilidad + valorConImpuestos;
        System.out.println("el valor de venta del producto deberia ser $"+ valorVentaPublico);

    }
}
