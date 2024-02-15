package org.daniel.ejemplo;

import org.daniel.pooherencia.*;

public class EjemploHerenciaConstructores {
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

        System.out.println("Imprimiendo datos en comun del tipo Persona");
        // IMPRIMIMOS
        System.out.println("Nombre: " + persona.getNombre() +
                " Apellido: " + persona.getApellido() +
                " edad: " + persona.getEdad() +
                " Email: " + persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Notass matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Notass historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Notass castellano: " + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional");
                System.out.println("Nota idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("============= SOBRE ESCRITURA PROMEDIO ===============");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("============= SOBRE ESCRITURA PROMEDIO ===============");
        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("============= SOBRE ESCRITURA SALUDAR ===============");
        System.out.println(persona.saludar());
        System.out.println("============================");
    }
}
