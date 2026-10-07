package POO.Ejercicios1;

public class Main {
    static void main() {
        Circulo circulo = new Circulo();
        System.out.println(circulo.getColor());
        circulo.getRadio();
        System.out.println(circulo.toString());
        circulo.setRadio(5.6);
        System.out.println(circulo.toString());
        System.out.println(circulo.area());
        circulo.decrece();
        System.out.println(circulo.getRadio());
    }
}
