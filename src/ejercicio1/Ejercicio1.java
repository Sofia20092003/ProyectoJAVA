package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       int numero1;
       int numero2;
       System.out.println("Ingrese el primer numero entero: ");
       Scanner sc = new Scanner(System.in);
       numero1 = sc.nextInt();
       System.out.println("Ingrese el segundo numero entero: ");
       numero2 = sc.nextInt();
       int suma = numero1 + numero2;
       int resta = numero1 - numero2;
       int multiplicacion = numero1 * numero2;
       double division = (double) numero1 / numero2;
       System.out.println("el resultado de la suma es: " + suma);
       System.out.println("el resultado de la resta es: " + resta);
       System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
       System.out.println("el resultado de la division es: " + division);
    }
}
