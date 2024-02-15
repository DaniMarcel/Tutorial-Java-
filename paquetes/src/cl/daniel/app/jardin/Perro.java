package cl.daniel.app.jardin;

import cl.daniel.app.hogar.Persona;

public class Perro {
     protected String nombre;
    protected String raza;

    String jugar(Persona persona){
        return persona.lanzarPelota();
    }
}
