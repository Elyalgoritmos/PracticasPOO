package ejercicio04_videojuego;

public class Main {

    public static void main(String[] args) {

        // videojuego 1
        Videojuego videojuego1 = new Videojuego();
        videojuego1.nombre = "Minecraft";
        videojuego1.genero = "Aventura";
        videojuego1.version = "1.21";
        videojuego1.activo = false;

        videojuego1.mostrarInformacion();

        System.out.println("Después:");

        videojuego1.iniciar();
        videojuego1.mostrarInformacion();


        // videojuego 2
        Videojuego videojuego2 = new Videojuego();
        videojuego2.nombre = "FIFA";
        videojuego2.genero = "Deportes";
        videojuego2.version = "2026";
        videojuego2.activo = true;

        videojuego2.mostrarInformacion();


        // videojuego 3
        Videojuego videojuego3 = new Videojuego();
        videojuego3.nombre = "Resident Evil";
        videojuego3.genero = "Terror";
        videojuego3.version = "4.0";
        videojuego3.activo = false;

        videojuego3.mostrarInformacion();
    }
}