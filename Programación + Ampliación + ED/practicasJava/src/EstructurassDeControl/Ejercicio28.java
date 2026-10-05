package EstructurassDeControl;

import javax.swing.*;

public class Ejercicio28 {

    public static void main(String[] args) {

        long resultado = 1L;

        System.out.println("Bienvenido a la calculadora factorial");

        int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número entero"));

        for (int i = numeroUsuario; i >= 1; i--) {

            resultado = resultado * i;

        }

        System.out.println("El factorial de " + numeroUsuario + " es: " + resultado);
    }
}

