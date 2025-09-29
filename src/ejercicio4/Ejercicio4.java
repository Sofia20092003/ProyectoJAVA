package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1;
        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        if(numero1%2==0){System.out.println("El numero es par");}
        else {System.out.println("El numero es impar");}
    }
}
