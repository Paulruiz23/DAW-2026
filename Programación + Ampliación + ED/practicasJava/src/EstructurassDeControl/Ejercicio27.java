package EstructurassDeControl;

import java.util.Scanner;

public class Ejercicio27 {
    static void main(String[] args) {
        int numeroUsuario;
        int contador = 0;
        int bucle = 0;
        int numeroAlea = (int)(Math.random()*100);
        System.out.println(numeroAlea);
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al juego ");
        System.out.println("Ingrese su número");
        numeroUsuario = sc.nextInt();
        do {
            if (numeroUsuario == numeroAlea) {
                System.out.println("Correcto lo as conseguido");
                contador++;
                bucle = 1;
            }
            else if (numeroUsuario < numeroAlea) {
                System.out.println("Numero muy bajo");
                contador++;
                System.out.println("Ingrese un numero nuevamente");
                numeroUsuario = sc.nextInt();
            }
            else if (numeroUsuario > numeroAlea) {
                System.out.println("Numero muy alto");
                contador++;
                System.out.println("Ingrese un numero nuevamente");
                numeroUsuario = sc.nextInt();
            }

        }
        while (bucle == 0);
        System.out.println("Numero de intentos totales: " + contador);

    }
}
