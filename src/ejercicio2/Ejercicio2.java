package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double base;
        double altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        altura = sc.nextDouble();
        double area = (double) (base*altura);
        System.out.println("El area del rectangulo es: " + area);
        double perimetro = (double) (2*(base+altura));
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
