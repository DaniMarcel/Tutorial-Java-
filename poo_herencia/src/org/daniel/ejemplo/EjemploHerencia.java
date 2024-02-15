package org.daniel.ejemplo;

import org.daniel.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        // CREAMOS ALUMNO Y PROFESOR
        System.out.println("======== Creando la instancia de la clase Alumno ========");
        Alumno alumno = new Alumno();
        alumno.setNombre("Daniel");
        alumno.setApellido("Marcel");
        alumno.setInstitucion("Domeyko");
        alumno.setNotaCastellano(2.6);
        alumno.setNotaHistoria(6.6);
        alumno.setNotaMatematicas(7.0);

        System.out.println("======== Creando la instancia de la clase AlumnoInternacional ========");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
          alumnoInt.setNombre("Juan");
          alumnoInt.setApellido("Riquelme");
          alumnoInt.setPais("Chile");
          alumnoInt.setEdad(25);
          alumnoInt.setInstitucion("Nacional");
          alumnoInt.setNotaCastellano(2.6);
          alumnoInt.setNotaHistoria(6.6);
          alumnoInt.setNotaMatematicas(7.0);
          alumnoInt.setNotaIdiomas(7.5);

        System.out.println("======== Creando la instancia de la clase Profesor ========");
        Profesor profesor = new Profesor();
        profesor.setNombre("Andres");
        profesor.setApellido("Rivera");
        profesor.setAsignatura("Matematicas");


        System.out.println("======== - ========");
        // IMPRIMIMOS
        System.out.println(alumno.getNombre() + " " +
                alumno.getApellido() +
                " de " +
                alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre() + " " +
                alumnoInt.getApellido() +
                " de " +
                alumnoInt.getInstitucion() +
                " pais: " + alumnoInt.getPais());

        System.out.println(profesor.getNombre() + " " +
                profesor.getApellido() +
                " hace clases de " +
                profesor.getAsignatura());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
