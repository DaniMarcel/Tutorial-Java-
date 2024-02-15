package com.daniel.appfacturas.models;


public class ItemFactura {
    // ATRIBUTOS
    private int cantidad;
    private Producto producto; // RELACION A PRODUCTO.JAVA

    // CONSTRUCTOR QUE INICIALICE LOS DOS
    public ItemFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    // GETTERS
    public int getCantidad() {
        return cantidad;
    }
    public Producto getProducto() {
        return producto;
    }

    // SETTERS
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    // METODO PARA CALCULAR IMPORTE Y GRAN TOTAL
    public float calcularImporte(){
        return this.cantidad * this.producto.getPrecio();
    }

    // TO STRING
    @Override
    public String toString() {
        return producto.toString() +
                "\t" + cantidad +
                "\t" + calcularImporte();
    }
}
