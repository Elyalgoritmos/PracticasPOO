package ejercicio03_cupon;

public class Main {
    public static void main(String[] args) {
        //cupon1 verano//
        Cupon cupon1 = new Cupon();
        cupon1.codigo= " VERANO20";
        cupon1.porcentajeDescuento= 20;
        cupon1.descripcion= "Por cada 50 dolares de compra en marca playero recibiras un descuento del 20 % ";
        cupon1.activo= false;
        cupon1.mostrarInformacion();
        System.out.println("Después:");
        cupon1.activar();
        cupon1.mostrarInformacion();

        //cupon bienvenida//
        Cupon cupon2 = new Cupon();
        cupon2.codigo = "BIENVENIDA10";
        cupon2.porcentajeDescuento = 10;
        cupon2.descripcion = "Descuento para nuevos clientes";
        cupon2.activo = true;

        cupon2.mostrarInformacion();
        cupon2.mostrarDescuento();
        cupon2.mostrarResumen();

        //cupon black//
        Cupon cupon3 = new Cupon();
        cupon3.codigo = "BLACK30";
        cupon3.porcentajeDescuento = 30;
        cupon3.descripcion = "Descuento especial por promocion";
        cupon3.activo = false;

        cupon3.mostrarInformacion();
        cupon3.mostrarDescuento();
        cupon3.mostrarResumen();
    }
}
