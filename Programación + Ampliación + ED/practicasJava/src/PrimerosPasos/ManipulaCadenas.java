package PrimerosPasos;

public class ManipulaCadenas {
    static void main() {
        String minombre = "Paul";
        System.out.println(minombre);
        System.out.println(minombre.length());
        System.out.println(minombre.charAt(2));
        System.out.println(minombre.charAt(minombre.length() - 1));
        String frase = "En un lugar de la Mancha";
        String extracto = frase.substring(5, 15);
        System.out.println(extracto);
        String nombre1 = "PAUL";
        String nombre2 = "paul";
        System.out.println(nombre1.equalsIgnoreCase(nombre2));
    }
    }
