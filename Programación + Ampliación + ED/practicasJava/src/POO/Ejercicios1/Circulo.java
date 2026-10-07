package POO.Ejercicios1;

import org.w3c.dom.ls.LSOutput;

public class Circulo {
    private double radio;
    private String color;
    private int centroX;
    private int centroY;

    public Circulo() {
        this.radio = 50;
        this.color = "Negro";
        this.centroX = 100;
        this.centroY = 100;
    }

    public String getColor() {
        return color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double nuevoRadio) {
        this.radio = nuevoRadio;
    }

    public double decrece() {
        return getRadio() / 1.3;
    }

    public double area() {
        return Math.PI*Math.pow(radio,2);

    }

    @Override
    public String toString() {
       return ("Circulo de Radio "+ getRadio() +", color: "+getColor()+" y centro: "+centroY+", "+ centroX+".");

    }
}

