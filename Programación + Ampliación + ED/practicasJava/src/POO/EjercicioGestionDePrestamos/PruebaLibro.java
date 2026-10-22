package POO.EjercicioGestionDePrestamos;

import java.util.Scanner;

public class PruebaLibro {
    static void main(String[] args) {
        Libro libro = new Libro("don quijote", "Cervantes", 1, 0);
        Libro libro2 = new Libro();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del libro: ");
        libro2.setTitulo(sc.nextLine());
        System.out.println("Introduce el nombre del Autor: ");
        libro2.setAutor(sc.nextLine());
        System.out.println("Cuantas ejemplares se añadirán: ");
        libro2.setEjemplares(sc.nextInt());
        System.out.println(libro);
        libro.prestamo();
        //System.out.println(libro);
        libro.devolucion();
        //System.out.println(libro);
        libro.prestamo();
        //System.out.println(libro);
        libro.prestamo();
        System.out.println(libro);
        System.out.println(libro2);
        libro2.setTitulo("La ciudad muerta");
        libro2.setAutor("Valderomar");
        libro2.setEjemplares(4);
        System.out.println(libro2);
        sc.close();
    }

}
