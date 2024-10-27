package Semana2.cajeroAutomatico;
import java.util.Scanner;

public class Cajero {
   private Scanner scanner;

   public  void menu(){
      scanner=new Scanner(System.in);
      System.out.println("Digte la clave");
      String clave=scanner.next();
      CuentaBancaria cuentabancaria=new CuentaBancaria("12221",clave);
      boolean valid= cuentabancaria.login();
      if (valid) {


      while(true) {
          System.out.println(" Por favor seleccione la opción");
          System.out.println("1. Consultar saldo");
          System.out.println("2. Depositar");
          System.out.println("3. Retirar");
          System.out.println("4. Salir");
          String opc = scanner.next();
          switch (opc) {

              case "1":
                  System.out.println("Su saldo es: " + cuentabancaria.getSaldo());
                  break;
              case "2":
                  System.out.println("Digite la cantidad a depositar");
                  double deposito = scanner.nextDouble();
                  System.out.println(cuentabancaria.depositar(deposito));
                  break;
              case "3":
                  System.out.println("Digite la cantidad a retirar");
                  double retiro = scanner.nextDouble();
                  System.out.print(cuentabancaria.retirar(retiro));
                  break;
              case "4":
                  System.exit(0);
                  break;
              default:
                  System.out.println("Opción incorrecta");


          }
      }



      }
      else{
          System.out.println("Clave incorrecta");
      }

   }


}
