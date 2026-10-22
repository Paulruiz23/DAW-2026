package POO.EjercicioLetraNif;

import java.util.Scanner;

public class NIF {
    private String letra;
    private int numero;

    public NIF() {
    }
    public NIF(int numero) {
        this.letra = calcularLetra();
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del DNI: ");
        this.numero = sc.nextInt();
    }
    private String calcularLetra() {
        String calculo = "";
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        calculo = letras[numero%23];
        return calculo;
    }

    @Override
    public String toString() {
        return "El NIF completo es: " + getNumero()+"-"+calcularLetra();
    }
}
