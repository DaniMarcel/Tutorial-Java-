package com.daniel.appfacturas.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    // ATRIBUTOS
    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente; // RELACION CON CLIENTE.JAVA
    private ItemFactura[] items; // RELACION CON ITEMFACTURA.JAVA
    private int indiceItems; // INDICE PARA EL ARRAY
    public static final int MAX_ITEMS = 12; // CONSTANTE PARA EL CONSTRUCTOR ITEMS
    private static int ultimoFolio; // PARA AUMENTAR EL FOLIO

    // CONSTRUCTOR
    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.folio = ++ultimoFolio;
        this.fecha = new Date();
    }

    // GETTERS
    public int getFolio() {
        return folio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public Date getFecha() {
        return fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ItemFactura[] getItems() {
        return items;
    }

    // SETTERS
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // METODOS, CALCULAR TOTAL, GENERAR DETALLES
    public void addItemFactura(ItemFactura item){
        if (indiceItems < MAX_ITEMS) {
            this.items[indiceItems++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for (int i = 0; i < indiceItems; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder();
        sb.append(folio)
                .append("\nCliente: ")
                .append(this.cliente.getNombre())
                .append("\t NIF: ")
                .append(cliente.getNif())
                .append("\nDescripcion: ")
                .append(this.descripcion)
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ")
                .append(df.format(this.fecha))
                .append("\n")
                .append("\n#\tNombre\t$\tCant.\tTotal\n");

        for (int i = 0; i < indiceItems; i++){
            sb.append(this.items[i].toString())
                    .append("\n");
        }
        sb.append("\nGran Total: ")
                .append(calcularTotal());

        return sb.toString();
        }

        // TO STRING
    @Override
    public String toString() {
        return generarDetalle();
    }
}
