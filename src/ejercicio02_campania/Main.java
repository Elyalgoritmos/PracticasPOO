package ejercicio02_campania;

public class Main {
    public static void main (String[] args){
        // campania 1///
        Campania campania1 =new Campania();
        campania1.nombre = "INSTAGRAM";
        campania1.presupuesto = 500;
        campania1.plataforma = "Instagram";
        campania1.activa = true;
        campania1.mostarInformacion();
        //campania 2//
        Campania campania2 =new Campania();
        campania2.nombre = "TIK TOK ";
        campania2.presupuesto = 30;
        campania2.plataforma = "TIK TOK";
        campania2.activa = true;
        campania2.mostarInformacion();

        //campania 3//
        Campania campania3 =new Campania();
        campania3.nombre = "FACEBOOK";
        campania3.presupuesto = 700;
        campania3.plataforma = "Facebook";
        campania3.activa = true;
        campania3.mostarInformacion();


        campania2.desactivar();
        campania2.mostarInformacion();
    }



}
