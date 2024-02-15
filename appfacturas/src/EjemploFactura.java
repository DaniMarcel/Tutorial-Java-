import com.daniel.appfacturas.models.Cliente;
import com.daniel.appfacturas.models.Factura;
import com.daniel.appfacturas.models.ItemFactura;
import com.daniel.appfacturas.models.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        // CREANDO LAS COSAS
        Cliente cliente = new Cliente();
        cliente.setNif("1111-5");
        cliente.setNombre("Daniel");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;

        System.out.println();

        for (int i = 0; i < 2; i++){
            producto = new Producto();
            System.out.print("Ingrese producto no. " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura);
    }
}
