package POO.Ejemplo1POO;

public class Televisor {
    private int canal;

    public Televisor() {
        this.canal = 1;
    }

    public Televisor(int valorCanal) {//contructor con argumento
       // this.canal = valorCanal;
        setCanal(valorCanal);
    }
    public void subirCanal() {
        //canal++;
        setCanal(canal+1);
    }
    public void bajarCanal() {
       // canal--;
        setCanal(canal-1);
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int valorCanal) {
        if (valorCanal < 1 || valorCanal > 99) {
            canal = 1;
        } else {
            canal = valorCanal;
        }
    }


}
