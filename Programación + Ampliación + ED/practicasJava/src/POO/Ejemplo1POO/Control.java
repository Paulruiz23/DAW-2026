package POO.Ejemplo1POO;

public class Control {
    static void main(String[] args) {

    Televisor tv1 = new Televisor();
    Televisor tv2 = new Televisor(6);


        tv1.getCanal();
        tv1.subirCanal();
        System.out.println("El canal actual es: "+tv1.getCanal());
        tv1.subirCanal();
        tv1.getCanal();
        System.out.println("El canal actual es: "+tv1.getCanal());
    }

}

