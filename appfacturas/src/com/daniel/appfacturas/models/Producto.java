package com.daniel.appfacturas.models;

public class Producto {
    // ATRIBUTOS
    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo; // PARA GENERAR EL CODIGO

    // CONSTRUCTOR
    public Producto() {
        this.codigo = ++ultimoCodigo;
    }

    // GETTERS
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public float getPrecio() {
        return precio;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return codigo +
                "\t" + nombre +
                "\t" + precio;
    }
}
