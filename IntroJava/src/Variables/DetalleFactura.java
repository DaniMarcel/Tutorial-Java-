package Variables;

import java.util.Scanner;

public class DetalleFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre de la factura:");
        String detalleFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto:");
        double precioProducto = scanner.nextDouble();

        System.out.println("Ingrese el precio del producto 2:");
        double precioProducto2 = scanner.nextDouble();

        double precioTotal = (precioProducto + precioProducto2);
        double precioProductoIva = (precioTotal * 0.19);
        double totalNeto = precioTotal + precioProductoIva;

        System.out.println("La factura de " + detalleFactura +
                " tiene un total bruto de " + precioTotal +
                ", con un impuesto de " + precioProductoIva +
                " y el monto despues de impuesto es de " + totalNeto);
    }
}
