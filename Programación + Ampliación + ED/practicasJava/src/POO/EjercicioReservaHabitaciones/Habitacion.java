package POO.EjercicioReservaHabitaciones;

import java.util.Scanner;

public class Habitacion {
    private int numero;
    private double precioNoche;
    private boolean ocupada;
    private String cliente;

    public Habitacion(int numero, double precioNoche){
        this.numero=numero;
        this.precioNoche=precioNoche;
        ocupada= false;
        cliente= "Libre";

    }

    public String estado() {
        if(ocupada==true){
            return "\nEstado = Ocupado";
        }
        else{
            return "\nEstado = Libre";
        }
    }
    public boolean reservar(String nombreCliente){
        this.cliente=nombreCliente;
        if(ocupada == false ){
            ocupada=true;
            return true;
        }else {
            ocupada=false;
            return false;
        }

    }

    public String getCliente() {
        if (cliente.equals("Libre")) {

            return "";
        } else {
            return "\nCliente = " + cliente;
        }
    }

    public boolean liberar(){
        cliente = "Libre";
        return false;
    }

    public String consultarEstado(){

        return "Habitacion = "+numero+"\nPrecio = "+precioNoche+" €"+estado()+getCliente();
    }

    public double calcularPrecio (int noches){

        return precioNoche*noches;
    }

    @Override
    public String toString() {
        return " Informacion resumida";
    }


}
