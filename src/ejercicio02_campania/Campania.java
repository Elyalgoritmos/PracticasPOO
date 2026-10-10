//PRÁCTICA ND1.2 — CAMPAÑA PUBLICITARIA
//Clase//Campania
//Atributos
//public://public String nombre;//public double presupuesto;//Acceso por defecto://String plataforma;//boolean activa;
//Métodos
//public://public void mostrarInformacion()//public void activar()//Acceso por defecto://void desactivar()//void mostrarPresupuesto()
//En Main
//Crea:// una campaña de Instagram;// una campaña de TikTok;// una campaña de Facebook//Cambia el estado de solamente una campaña.//¿Por qué activar una campaña no modifica las demás?
package ejercicio02_campania;

public class Campania {
    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void mostarInformacion(){
        System.out.println("Nombre : " + nombre);
        System.out.println(" Presupuesto : " + presupuesto);
        System.out.println( " Plataforma : " + plataforma);
        System.out.println(" Estado : "+ activa);
    }
    public void activar(){
        activa = true;
    }
    void desactivar(){
        activa= false;

    }
    void mostrarPresupuesto(){
        System.out.println("Presupuesto : " + presupuesto);
    }
}
