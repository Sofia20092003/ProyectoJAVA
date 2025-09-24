package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double precio;
        System.out.println("Ingrese el precio real del producto");
        Scanner sc = new Scanner(System.in);
        precio = sc.nextDouble();
        if(precio>100){
            System.out.println("Aplica el descuento");
            double descuento = precio - (precio*0.15);
            System.out.println("El precio final del prodructo con el descuento es: " + descuento + "€");
        }
        else if(precio<100){System.out.println("No aplica el descuento");}
    }
}
