package POO.EjercicioCoche;

import javax.swing.*;

public class Coche {
    private int ruedas;
    private double largo;
    private double ancho;
    private int motor;
    private int peso_plataforma;
    private double peso_total;
    private String asientos_cuero;
    private String color;
    private String climatizador;
    private double carroceria;
    private int peso_asientos;
    private int peso_climatizador;
    private double precio_base;
    private double precio_Asientos;
    private double precio_Climatizador;

    public Coche() {
        this.ruedas = 4;
        this.largo = 2000;
        this.ancho = 3000;
        this.motor = 1600;
        this.peso_plataforma = 500;
        this.carroceria = 200;
        this.peso_asientos = 60;
        this.peso_climatizador = 150;
        this.precio_base = 10000;
        this.precio_Asientos = 250;
        this.precio_Climatizador = 450;
    }

    public String dime_Datos_Generales() {
        return "Los datos del coche son: " + ruedas + " ruedas, " + largo + " cm de largo, " + ancho + " cm de ancho, " + " motor de " + motor + " cc, " + " y peso de plataforma de " + peso_plataforma + " kg.";
    }

    public String establece_color() {
        color = JOptionPane.showInputDialog("Asigna un color al coche");
        return color;
    }

    public String dime_Color() {
        return "El color del auto es: " + color;
    }

    public String configura_Asientos() {
        asientos_cuero = JOptionPane.showInputDialog("El auto tiene asientos de cuero (si/no)");
        return asientos_cuero;
    }

    public String dime_Asientos() {
        return "El auto " + asientos_cuero + " tiene asientos de cuero";
    }

    public String configura_Climatizador() {
        climatizador = JOptionPane.showInputDialog("El auto tiene climatizador (si/no)");
        return climatizador;
    }

    public String dime_Climatizador() {

        return "El auto " + climatizador + " tiene climatizador";
    }

    public String dime_Peso_Coche() {
        peso_total = peso_asientos + peso_climatizador + peso_plataforma + carroceria;

        return "El peso del auto es :" + peso_total + " Kg.";
    }

    public String precio_Coche() {
        double precio = (precio_base + precio_Climatizador + precio_Asientos);
        return "El precio del coche es: " + precio + " $.";
    }

}
