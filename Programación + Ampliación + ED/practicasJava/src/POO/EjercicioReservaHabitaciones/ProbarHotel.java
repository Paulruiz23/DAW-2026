package POO.EjercicioReservaHabitaciones;

import javax.swing.*;
import java.util.Scanner;
import java.util.logging.Handler;

public class ProbarHotel {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion(101, 80.0);
        Scanner sc=new Scanner(System.in);
        int solicitud;
         do {
             System.out.println("""
                
                ======== HOTEL ==========
                
                1. Consultar habitación
                2. Reservar habitación
                3. Liberar habitación
                4. Calcular precio de estancia
                5. Consultar estado
                6. Salir\s
                Ingrese la opcion a usar:
                """);

         solicitud= sc.nextInt();

        switch (solicitud){
            case 1:
                System.out.println(habitacion.consultarEstado());
                break;
            case 2:
                //System.out.println("Ingrese su nombre completo porfavor");
                //habitacion.reservar(JOptionPane.showInputDialog("Ingresa su nombre completo porfavor")
               // String nombre= JOptionPane.showInputDialog("Ingresa su nombre completo porfavor");
                //String nombre = sc.nextLine();
                sc.nextLine();
                System.out.println("Ingrese su nombre:");
                if (habitacion.reservar(sc.nextLine())==true) {
                    System.out.println("Habitacion reservada");
                } else {
                    System.out.println("No se puede reservar");

                }
                break;
            case 3:
                if (habitacion.liberar() == false) {
                    System.out.println("Habitacion Liberada");
                }
                break;
            case 4:
                System.out.println("Ingrese el numero de noches");
                System.out.println(habitacion.calcularPrecio(sc.nextInt()));
                break;

            case 5:;

                System.out.println(habitacion.consultarEstado());
                break;

            case 6:
                System.out.println("Gracias por usar el programa");
                break;
            default:
                System.out.println("Opcion no valida");
            }
        }
         while (solicitud!=6);
        sc.close();
    }
    }


