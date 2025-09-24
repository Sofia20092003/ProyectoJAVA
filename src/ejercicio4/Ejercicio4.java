package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int numero1;
        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner(System.in);
        numero1 = sc.nextInt();
        int modulo = numero1%10;
        if(modulo==2){System.out.println("El numero es par");}
        else if(modulo==1){System.out.println("El numero es impar");}
    }
}
