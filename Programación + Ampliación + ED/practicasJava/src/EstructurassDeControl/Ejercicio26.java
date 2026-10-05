
package EstructurassDeControl;

import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {

        int numeroUsuario;
        int contador = 0;
        int bucle = 0;

        int numeroAlea = (int)(Math.random() * 100);

        // Para comprobar el número generado
        System.out.println(numeroAlea);

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego");
        System.out.println("Ingrese su número");
        numeroUsuario = sc.nextInt();

        // Se repite mientras no hayamos acertado
        while (bucle == 0) {

            if (numeroUsuario == numeroAlea) {

                System.out.println("Correcto, lo has conseguido");
                contador++;
                bucle = 1;

            } else if (numeroUsuario < numeroAlea) {

                System.out.println("Número muy bajo");
                contador++;

                System.out.println("Ingrese un número nuevamente");
                numeroUsuario = sc.nextInt();

            } else if (numeroUsuario > numeroAlea) {

                System.out.println("Número muy alto");
                contador++;

                System.out.println("Ingrese un número nuevamente");
                numeroUsuario = sc.nextInt();
            }
        }

        System.out.println("Número de intentos totales: " + contador);

        sc.close();
    }
}