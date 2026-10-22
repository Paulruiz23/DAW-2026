package POO.EjercicioMaquinaExpendedora;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio+" €");
        System.out.println("Unidades disponibles: " + stock);
    }
    public boolean hayStock() {
        return stock > 0;
    }
    public void venderProducto() {
        if (hayStock()) {
            stock--;
        } else {
            System.out.println("No tiene un stock para vender");
        }
    }




}
