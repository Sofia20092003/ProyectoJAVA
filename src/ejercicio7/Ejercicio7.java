package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int nota;
        System.out.println("Ingrese su calificacion: ");
        Scanner sc = new Scanner(System.in);
        nota = sc.nextInt();
        if(nota>=0 && nota<=4){System.out.println("Usted esta suspenso.");}
        else if (nota==5) {System.out.println("Aprobado.");}
        else if (nota==6) {System.out.println("Bien.");}
        else if (nota>=7 && nota<=8) {System.out.println("Notable.");}
        else if (nota>=9 && nota<=10) {System.out.println("Sobresaliente.");}
        }
    }

