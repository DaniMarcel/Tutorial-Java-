package StringCadenas;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        // entrada para linea de comandos
        Scanner scanner = new Scanner(System.in);

        // nombre 1
        System.out.println("Ingrese nombre 1: ");
        String nombre1 = scanner.nextLine();
        String nombreFinal = nombre1.toUpperCase().charAt(1)+"."+ nombre1.substring(nombre1.length() - 2);
        System.out.println("nombreFinal = " + nombreFinal);

        // nombre 2
        System.out.println("Ingrese nombre 2: ");
        String nombre2 = scanner.nextLine();
        String nombreFinal2 = nombre2.toUpperCase().charAt(1)+"."+ nombre2.substring(nombre2.length() - 2);

        // nombre 3
        System.out.println("Ingrese nombre 3: ");
        String nombre3 = scanner.nextLine();
        String nombreFinal3 = nombre3.toUpperCase().charAt(1)+"."+ nombre3.substring(nombre3.length() - 2);

        String resultadoFinal = nombreFinal + "_" + nombreFinal2 + "_" + nombreFinal3;
        System.out.println(resultadoFinal);
    }
}
