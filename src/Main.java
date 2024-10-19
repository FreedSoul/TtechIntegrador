import ejercicio1.*;
import ejercicio2.*;
import ejercicio3.*;
import ejercicio4.*;
import ejercicio5.*;
import ejercicio6.*;
//import ejercicio7;
import ejercicio8.*;
import ejercicio9.*;
import ejercicio10.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        boolean askAgain = true;
        do{
            System.out.println("que ejercicio deseas ejecutar?");
            System.out.println("1.  2.  3.  4.  5.\n6.  8.  9.  10.");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    // ejercicio 1
                    CalcularNotaEstudiante nota = new CalcularNotaEstudiante();
                    nota.calificarEstudiante();
                    askAgain = false;
                    break;
                case 2:
                    // ejercicio 2
                    PrecioVentaProducto producto = new PrecioVentaProducto();
                    producto.calcularPrecioVenta();
                    askAgain = false;
                    break;
                case 3:
                    // ejercicio 3
                    CalcularHonorarios empleadoHonorarios = new CalcularHonorarios();
                    empleadoHonorarios.calcularPagoEmpleado();
                    askAgain = false;
                    break;
                case 4:
                    // ejercicio 4
                    CalcularSalario empleadoSalario = new CalcularSalario();
                    empleadoSalario.calcularSalarioHorasExtras();
                    askAgain = false;
                    break;
                case 5:
                    // ejercicio 5
                    CobroParqueo usuario = new CobroParqueo();
                    usuario.calcularCobroParqueo();
                    askAgain = false;
                    break;
                case 6:
                    // ejercicio 6
                    SupermercadoDescuento comprador = new SupermercadoDescuento();
                    comprador.calcularCobroDescuento();
                    askAgain = false;
                    break;
                // ejercicio 7
                case 8:
                    // ejercicio 8
                    CuestionarioCorto cuestionario = new CuestionarioCorto();
                    cuestionario.startQuestionaire();
                    askAgain = false;
                    break;
                case 9:
                    // ejercicio 9
                    ProveedorEstereos proveedor = new ProveedorEstereos();
                    proveedor.calculateFinalPrice();
                    askAgain = false;
                    break;
                case 10:
                    // ejercicio 10
                    AlquilarCarros vendedor = new AlquilarCarros();
                    vendedor.calcularAlquilarAuto();
                    askAgain = false;
                    break;
                default:
                    System.out.println("haz escogido una opcion incorrecta");
                    break;
            }
        }while (askAgain);
    }
}