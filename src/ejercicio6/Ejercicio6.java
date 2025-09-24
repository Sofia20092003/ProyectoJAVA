package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String nombreusuario;
        String usuario= "admin";
        System.out.println("Introduce el nombre del usuario");
        Scanner sc = new Scanner(System.in);
        nombreusuario = sc.nextLine();
        if(nombreusuario.equals(usuario)){System.out.println("Bienvenido");}
        else{System.out.println("Acceso denegado");}
    }
}
