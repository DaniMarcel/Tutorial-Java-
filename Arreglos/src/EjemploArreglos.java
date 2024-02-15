import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        // STRING
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive 65GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro Externo";
        productos[3] = "Notebook Asus";
        productos[4] = "Macbook air Pro";
        productos[5] = "Iphone 12 Pro Max";
        productos[6] = "bicicleta Oxford";

        // ordenar A - Z
        Arrays.sort(productos);

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);

        // ENTEROS
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("20");
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // ordenar menos a mayor
        Arrays.sort(numeros);

        int a = numeros[0];
        int b = numeros[1];
        int c = numeros[2];
        int d = numeros[3];
        int e = numeros[numeros.length - 1];

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
