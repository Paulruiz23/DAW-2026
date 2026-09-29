package EstructurassDeControl;

import javax.swing.*;

public class Ejercicio23 {
    static void main() {
        String genero ;
        do {
            genero = JOptionPane.showInputDialog("Ingrese su genero (H) si es hombre o (M) si es mujer");
        }
        while (genero.equalsIgnoreCase("h")==false&&genero.equalsIgnoreCase("m")==false);
        String altura = JOptionPane.showInputDialog("Ingrese su altura en centimetros");
        int a = Integer.parseInt(altura);
        int pesoIdeal = 0;
        if (genero.equalsIgnoreCase("h")) {
            pesoIdeal = a - 110;
            System.out.println("Tu peso ideal es " + pesoIdeal + "Kg");
        } else if (genero.equalsIgnoreCase("m")) {
            pesoIdeal = a - 120;
            System.out.println("Tu peso ideal es " + pesoIdeal + "Kg");
        }



        //String altura = JOptionPane.showInputDialog("Ingrese su Altura ");
        //int a = Integer.parseInt(ladocu);
    }
}
