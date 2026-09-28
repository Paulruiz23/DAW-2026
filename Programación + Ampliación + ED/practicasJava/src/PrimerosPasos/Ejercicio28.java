package PrimerosPasos;

import java.util.Scanner;

public class Ejercicio28 {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        double numero = sc.nextDouble();
       // System.out.println(numero);
        double cuadrado = numero * numero;
        System.out.println("El cuadrado es = "+cuadrado);


    }
}
