package POO.EjercicioCoche;

public class miCoche {
    static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.dime_Datos_Generales();
        miCoche.establece_color();
        miCoche.configura_Asientos();
        miCoche.configura_Climatizador();
        System.out.println(miCoche.dime_Color());
        System.out.println(miCoche.dime_Datos_Generales());
        System.out.println(miCoche.dime_Asientos());
        System.out.println(miCoche.dime_Climatizador());
        System.out.println(miCoche.dime_Peso_Coche());
        System.out.println(miCoche.precio_Coche());

    }
}
