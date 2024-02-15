package org.daniel.pooherencia;

public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;

    public Persona(){
        System.out.println("Personas: inicializando constructor...");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre,apellido);
        this.edad = edad;
    }

    // GENERAMOS GET AND SET PARA QUE LAS DEMAS PUEDAN ACCEDER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // METODOS
    public String saludar(){
        return "Hola que tal";
    }

    // TO STRING
    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", saludo=" + this.saludar();
    }
}
