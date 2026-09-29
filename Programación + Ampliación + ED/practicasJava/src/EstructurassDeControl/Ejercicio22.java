package EstructurassDeControl;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1 - Cuadrado
                2 - Rectangulo
                3 - Triangulo
                4 - Circulo
                """);
        System.out.println("Ingrese el menu a ejecutar");
        int menu = sc.nextInt();

        switch (menu) {
            case 1 :
                // System.out.println("Area del cuadrado");
              //  int ladocu = sc.nextInt();

                String ladocu = JOptionPane.showInputDialog(null,"Ingrese el lado del cuadrado ");

                int a = Integer.parseInt(ladocu);
                System.out.println("Area del cuadrado = " + Math.pow(a,2));
                break;
            case 2 :
                System.out.println("Ingrese la base y al altura del rectangulo");
                //System.out.println("Primero ingrese su base");
                //int baserec = sc.nextInt();
                String baserec = JOptionPane.showInputDialog("Primero ingrese su base ");
                int b = Integer.parseInt(baserec);
//                System.out.println("Ahora ingrese su altura");
//                int alturarec = sc.nextInt();
                String altrec = JOptionPane.showInputDialog("Primero ingrese su base ");
                int ar = Integer.parseInt(altrec);
                System.out.println("El area de su rectangulo es = " + ar * b);
                break;
            case 3:
                System.out.println("Ingrese la base y la altura de su triangulo");
//                System.out.println("Primero ingrese su base");
//                int basetri = sc.nextInt();
                String basetri = JOptionPane.showInputDialog("Primero ingrese su base ");
                int bt = Integer.parseInt(basetri);
//                System.out.println("Ahora ingrese su altura");
//                int altri = sc.nextInt();
                String altri = JOptionPane.showInputDialog("Primero ingrese su base ");
                int at = Integer.parseInt(altri);
                System.out.println("El area de us triangulo es = " + bt * at);
                break;
            case 4:
                System.out.println("Ingrese el radio de su circulo");
//                double radio = sc.nextDouble();
//                System.out.println("El area de su circulo es = %.2f%n "+ pi*((int)radio^2));
                String radio = JOptionPane.showInputDialog("Primero ingrese su radio ");
                double r = Double.parseDouble(radio);
                System.out.printf("El area de su circulo es = %.2f%n", Math.PI*Math.pow(r,2));
                break;
            default:
                System.out.println("Termino el programa");
            }
        }







    }

