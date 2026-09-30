package EstructurassDeControl;

import javax.swing.*;
import java.io.StringReader;

public class Ejercicio24 {
    static void main() {
        int contador = 0;
        boolean punto = false;
        String direccion = JOptionPane.showInputDialog("Introdusca una direccion de correo");
        //System.out.println(direccion);
        for (int i = 0; i < (direccion.length()); i++) {
            System.out.println(direccion.charAt(i));
            if (direccion.charAt(i)=='@'||direccion.charAt(i)=='.'){
            contador++;
            }
            if (direccion.charAt(i)=='.') {
                punto = true;

            }
        }
        System.out.println(contador);
        if (contador == 1 && punto==true) {
            System.out.println("Correo Valido");

        } else {
            System.out.println("Correo Invalido");
        }
    }

}

