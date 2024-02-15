package Operadores;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        // pedir nombre de la famila
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre1 y apellido1");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese nombre2 y apellido2");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre3 y apellido3");

        String[] cantidad1 = nombre1.split(" ");
        String[] cantidad2 = nombre2.split(" ");
        String[] cantidad3 = nombre3.split(" ");

        //System.out.println("cantidad1 = " + cantidad1[0]);

        if (cantidad1[0].length() > cantidad2[0].length() && cantidad1[0].length() > cantidad3[0].length()){
            System.out.println(nombre1 + " tiene el nombre mas largo");
        } else if (cantidad2[0].length() > cantidad1[0].length() && cantidad2[0].length() > cantidad3[0].length()) {
            System.out.println(nombre2 + " tiene el nombre mas largo");
        } else {
            System.out.println(nombre3 + " tiene el nombre mas largo");
        }

    }
}
