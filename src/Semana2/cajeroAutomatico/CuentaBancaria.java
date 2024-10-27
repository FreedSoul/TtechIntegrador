package Semana2.cajeroAutomatico;

public class CuentaBancaria {
   private String numeroCuenta;
   private String password;
   private double saldo;
   private String mensaje;
   private  final String passwordusu="ab12";

    public CuentaBancaria(String numeroCuenta, String password) {
        this.numeroCuenta = numeroCuenta;
        this.password = password;
        this.mensaje ="";
        this.saldo = 0;
    }

    public boolean login(){
        boolean validacion = false;
        if (password.equals(passwordusu)){
            validacion=true;
        }

        return validacion;
    }


    public String depositar(double cantidad){
       if (cantidad>0) {
           saldo = saldo + cantidad;
       }

        return  "Consignacion ok";

    }
    public String retirar(double cantidad){
       if (cantidad>0 && cantidad<=saldo) {

           saldo = saldo - cantidad;
           mensaje = "Retiro exitoso\n";
       } else {
               mensaje = "Fondos insuficinete\n";
           }

       return mensaje;
    }



    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getMensaje() {
        return mensaje;
    }
}
