package POO.EjercicioLetraNif;


public class ProbarNIF {
    static void main(String[] args) {
        NIF nif2 = new NIF( 12345678);
        System.out.println(nif2);
        NIF nif = new NIF();
        nif.leer();
        System.out.println(nif);

    }
}
