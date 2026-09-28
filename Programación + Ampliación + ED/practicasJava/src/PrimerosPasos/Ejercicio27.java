package PrimerosPasos;

import javax.swing.*;

public class Ejercicio27 {
    static void main() {
        double numero1 = 1000.0;
        double resultado = numero1 / 3;
        System.out.printf("El valor con 4 decimales es: %.4f%n", resultado);
        String a = JOptionPane.showInputDialog("Introduce tu edad");
        System.out.println(a);
        Double edad1= Double.parseDouble(a);
        System.out.println(edad1);
        System.out.println(Math.sqrt(edad1));

    }
}
