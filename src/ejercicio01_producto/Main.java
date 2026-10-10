package ejercicio01_producto;

public class Main {
    public static void main(String[] args){
        //datos del producto 1 //
        Producto producto1=new Producto();
        producto1.nombre="Audifonos Bluetooth";
        producto1.precio= 32.50;
        producto1.disponible=true;
        producto1.categoria="Tecnologia";
        producto1.mostrarInformacion();
        System.out.println("Después:");
        producto1.cambiarDisponibilidad(false);
        producto1.mostrarDisponibilidad();
        //datos del producto 2//

        Producto producto2 = new Producto();
        producto2.nombre="Lentes de realidad aumentada";
        producto2.precio= 90.50;
        producto2.disponible=true;
        producto2.categoria="IA";
        producto2.mostrarInformacion();


        //datos del producto 3//
        Producto producto3 = new Producto();
        producto3.nombre="Robot de gato";
        producto3.precio= 1000.50;
        producto3.disponible=false;
        producto3.categoria="juguete electronico";
        producto3.mostrarInformacion();

    }

}