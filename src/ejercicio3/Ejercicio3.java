package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = teclado.nextInt();
        if(edad>=18){System.out.println("Usted es mayor de edad");}
        else{System.out.println("Usted es menor de edad");}
    }
}
