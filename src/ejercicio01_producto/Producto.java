//NEGOCIOS DIGITALES
//PRÁCTICA ND1.1 — PRODUCTOS DE UNA TIENDA ONLINE
//Una tienda digital desea registrar los productos publicados en su catálogo Crea una clase://Producto//Atributos//Debes declarar exactamente los siguientes atributos://public:
//public String nombre;//public double precio;//Acceso por defecto://String categoria;//boolean disponible;//Métodos//Debes crear los siguientes métodos://public:
//public void mostrarInformacion()//Debe mostrar todos los datos del producto.//public void cambiarDisponibilidad(boolean nuevaDisponibilidad)//Debe modificar el atributo disponible.//Acceso por defecto://void mostrarPrecio()
//Debe mostrar únicamente el precio.//void mostrarDisponibilidad()//Debe indicar si el producto se encuentra disponible.
//En Main
//Crea tres productos utilizando://Producto producto1 = new Producto();//Producto producto2 = new Producto();//Producto producto3 = new Producto();
//Asigna valores diferentes a cada uno.//Prueba sugerida//Nombre: Audífonos Bluetooth//Precio: 32.50//Categoría: Tecnología//Disponible: true
//Después:
//Disponible: false//Reflexiona
//1. ¿Cuáles atributos son public?//2. ¿Cuáles tienen acceso por defecto?
//3. ¿Qué diferencia observas entre ambos tipos de declaración?//4. ¿Qué ocurre con los otros productos cuando modificas uno?
package ejercicio01_producto;

public class Producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;


    public void mostrarInformacion(){
        System.out.println("Nombre : " + nombre );
        System.out.println("Precio : " + precio );
        System.out.println("Categoria :" + categoria );
        System.out.println("Disponible :" + disponible );

    }
   public void cambiarDisponibilidad(boolean nuevaDisponibilidad){
     disponible=nuevaDisponibilidad;
    }
    void mostrarPrecio(){
        System.out.println("Precio : " + precio);
    }
    void mostrarDisponibilidad(){
        System.out.println("Disponible : " + disponible );
    }
}
