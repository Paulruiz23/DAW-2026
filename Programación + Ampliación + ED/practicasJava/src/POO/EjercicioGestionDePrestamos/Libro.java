package POO.EjercicioGestionDePrestamos;

public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro() {}
    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }

    public boolean prestamo() {
        if (ejemplares > 0) {
            ejemplares--;
            prestados++;
            return true;
        }else  {
            System.out.println("El libro no puede estar prestamo ya que no quedan unidades.");
            return false;
        }
    }

    public boolean devolucion() {
        if (prestados > 0) {
            ejemplares++;
            prestados--;
            return true;
        }else  {

            return false;
        }
    }

    @Override
    public String toString() {
        return "Titulo = "+getTitulo()+ "\nAutor = "+getAutor()+"\nEjemplares = "+getEjemplares()+"\nPrestados = "+getPrestados();
    }
}
