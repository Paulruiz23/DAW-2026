package EstructurassDeControl;

import javax.swing.*;

public class Ejercicio25 {
    static void main(String[] args) {
        int contador;
        String contraCorrecta = "Paul123";
        do {
            String contra = JOptionPane.showInputDialog("Ingrese la contraseña");
            if (contraCorrecta.equals(contra)) {
                System.out.println("Contraseña Corrrecta");
                System.out.println("Acceso Permitido");
                contador = 0;

            } else {
                System.out.println("Contraseña incorrecta");
                System.out.println("Acceso Denegado");
                contador = 1;
            }
        }
        while (contador == 1);


    }
}
