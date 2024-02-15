package cl.daniel.app.jardin;

import cl.daniel.app.hogar.*;
//import cl.daniel.app.hogar.Persona;
//import static cl.daniel.app.hogar.ColorPelo.CAFE;
import static cl.daniel.app.hogar.ColorPelo.*;
import static cl.daniel.app.hogar.Persona.*;
//import static cl.daniel.app.hogar.Persona.GENERO_FEMENINO;
//import static cl.daniel.app.hogar.Persona.GENERO_MASCULINO;

public class EjemploPaquetes {
    public static void main(String[] args) {

       Persona p = new Persona();
       p.setNombre("Daniel");
       p.setApellido("Marcel");
       p.setColorPelo(CASTANIO);
       System.out.println(p.getNombre() + " " + p.getApellido());

        Perro perro = new Perro();
        perro.nombre = "Beri";
        perro.raza = "Doberman";
        //System.out.println(perro.nombre + " es de raza: " + perro.raza);

        String jugando = perro.jugar(p);
        System.out.println(jugando);

        String saludo = saludar();
        System.out.println(saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;


    }
}
