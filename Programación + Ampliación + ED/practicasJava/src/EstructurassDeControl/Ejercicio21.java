package EstructurassDeControl;

import java.util.Scanner;

public class Ejercicio21 {
    static void main() {
        int edad;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Ingrese la edad");
        edad = scaner.nextInt();

        System.out.println("La edad es = " + edad);
        if (edad < 18) {
            System.out.println("eres adolecente");
        } else {
            if (edad < 39 && edad > 18) {
                System.out.println("Eres Joven");
            } else {
                if (edad < 64 && edad > 40) {
                    System.out.println("Eres maduro");
                } else{
                    if (edad >= 65) {
                        System.out.println("cuidate");
                    }
                    }
            }
        }
    }
}
