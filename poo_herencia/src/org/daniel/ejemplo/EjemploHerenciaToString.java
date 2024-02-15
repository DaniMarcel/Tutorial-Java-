package org.daniel.ejemplo;

import org.daniel.pooherencia.Alumno;
import org.daniel.pooherencia.AlumnoInternacional;
import org.daniel.pooherencia.Persona;
import org.daniel.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        // CREAMOS ALUMNO Y PROFESOR
        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno("Daniel","Marcel",25,"Domeyko");
        alumno.setNotaCastellano(2.6);
        alumno.setNotaHistoria(6.6);
        alumno.setNotaMatematicas(7.0);
        alumno.setEmail("dahjhda@hotmail.com");

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Juan","Riquelme","Chile");
        alumnoInt.setEdad(25);
        alumnoInt.setInstitucion("Nacional");
        alumnoInt.setNotaCastellano(2.6);
        alumnoInt.setNotaHistoria(6.6);
        alumnoInt.setNotaMatematicas(7.0);
        alumnoInt.setNotaIdiomas(7.5);
        alumnoInt.setEmail("dahjhda@hotmail.com");

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor("Andres","Rivera","Matematicas");
        profesor.setEdad(45);
        profesor.setEmail("dahjhda@hotmail.com");


        System.out.println("======== - ========");

        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("================");
        System.out.println(persona);
    }
}
