package POO.EjercicioMaquinaExpendedora;

import java.util.Scanner;

public class ProbarMaquina {
    static void main(String[] args) {
        Producto refresco = new Producto("Refresco", 1.50, 1);
        Scanner sc=new Scanner(System.in);
        String  solicitud;
        do {
            System.out.println("""
                
                ======== Maquina Expendedora ==========
                
                1. Ver producto
                2. Comprar producto
                3. Rellenar Stock             
                4. Salir\s
                Ingrese la opcion a usar:
                """);
            solicitud= sc.nextLine();
            //sc.nextLine();

            switch (solicitud){
                case "1":
                    refresco.mostrarInformacion();
                    break;
                case "2":

                    if(refresco.hayStock()==true){
                        System.out.println("Ingrese el dinero por el valor del producto: ");
                        double dinero=sc.nextDouble();
                        System.out.println("Si hay stock de refrescos");
                        sc.nextLine();

                        if (refresco.getPrecio() <= dinero) {
                            System.out.println("cantidad ingresada correcta");
                            refresco.venderProducto();
                            double cambio =  dinero-refresco.getPrecio();
                            System.out.println("Su saldo es: " + dinero + " €");
                            System.out.println("Precio del refresco: " + refresco.getPrecio()+" €");
                            System.out.println("Su cambio es : " + cambio+" €");
                            System.out.println("El nuevo stock de refrescos es: "+refresco.getStock()+" unidades");
                        }
                        else
                            System.out.println("cantidad ingresada incorrecta");
                    }
                    else
                        System.out.println("No tiene stock de refrescos");

                    break;
                case "3":
                    System.out.println("Ingrese la cantidad a aumentar");
                    int aumentar=sc.nextInt();
                    refresco.setStock(aumentar+refresco.getStock());
                    System.out.println("El nuevo stock de refrescos es: "+refresco.getStock()+" unidades");
                    sc.nextLine();
                    break;
                case "4":
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
        while (!solicitud.equalsIgnoreCase("4"));
        sc.close();
    }
}
