package Semana2.loginUsuario;

import java.util.Scanner;

public class LoginUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 3;
        String passwordOnDb = "12345";
        String usuarioOnDB = "mateo";
        String usuario = "";
        String password = "";
        while (intentos > 0) {
            System.out.println("ingresa el usuario:");
            usuario = sc.nextLine();
            System.out.println("ingresa la contraseña:");
            password = sc.nextLine();
            if ((password.equalsIgnoreCase(passwordOnDb)) && (usuario.equalsIgnoreCase(usuarioOnDB))) {
                System.out.println(STR."bienvenido \{usuarioOnDB} haz iniciado sesion");
                break;
            } else {
                System.out.println("usuario y/o contraseña no estan correctas");
                intentos--;
                System.out.println(STR."tienes \{intentos} intentos mas");
            }
        }
        if (intentos == 0) {
            System.out.println("Haz usado todos tus intentos, el usuario ha sido bloqueado");
        }
    }
}
