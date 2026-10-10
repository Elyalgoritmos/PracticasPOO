//SOFTWARE
//PRÁCTICA SW1.1 — VIDEOJUEGO
//Clase//Videojuego//Atributos
//public://public String nombre;//public String genero;
//Acceso por defecto://String version;//boolean activo;//Métodos
//public://public void mostrarInformacion()//public void iniciar()
//Acceso por defecto://void cerrar()//void mostrarVersion()
//Actividad//Crea tres videojuegos y comprueba que cada objeto mantiene sus propios//valores.

package ejercicio04_videojuego;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;
    public void mostrarInformacion(){
        System.out.println("Nombre : "+ nombre );
        System.out.println(" Genero : " + genero);
        System.out.println("vercion : " + version);
        System.out.println("activo : " + activo);
    }

    public void iniciar(){
        activo=true;

    }
    void cerrar(){
        activo=false;

    }
    void mostrarVersion(){
        System.out.println("Version : " + version);
    }
}
