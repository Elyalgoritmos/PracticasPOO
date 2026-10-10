//PRÁCTICA ND1.3 — CUPÓN DE DESCUENTO
//Clase//Cupon//Atributos
//public://public String codigo;//public double porcentajeDescuento;
//Acceso por defecto://String descripcion;//boolean activo;//Métodos//public://public void mostrarInformacion()//public void activar()//Acceso por defecto:
//void desactivar()//void mostrarDescuento()//Prueba//Crea tres cupones.
//Ejemplo://Código: VERANO20
//Descuento: 20%//Activo: true//Desafío
//Agrega un método con acceso por defecto://void mostrarResumen()//Resultado aproximado://Cupón VERANO20 - Descuento 20//
package ejercicio03_cupon;

public class Cupon {
    public String codigo;
    public double porcentajeDescuento;
    String descripcion;
    boolean activo;
     public void mostrarInformacion(){
         System.out.println(" Codigo : "+ codigo);
         System.out.println("Procentaje de Descuento : " + porcentajeDescuento);
         System.out.println("Descripciom : " + descripcion);
         System.out.println(" activo : " + activo);
     }
     public void activar(){
         activo=true;
     }
     void desactivar(){
         activo=false;
     }
     void mostrarDescuento(){
         System.out.println("Descuentos : " + porcentajeDescuento + "%" );
     }
    void mostrarResumen() {
        System.out.println("Cupon " + codigo + " - Descuento " + porcentajeDescuento + "%");
    }
}
