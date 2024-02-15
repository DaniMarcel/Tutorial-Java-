package Operadores;

import java.util.Scanner;

public class SistemaEstanqueGasolina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese gasolina actual: ");
        double cantidad = scanner.nextDouble();
        System.out.println("cantidad en litros = " + cantidad);

        if (cantidad == 70){
            System.out.println("Estanque lleno");
        } else if (cantidad >= 60 && cantidad < 70) {
            System.out.println("Estanque casi lleno");
        } else if (cantidad >= 40 && cantidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (cantidad >= 35 && cantidad < 40) {
            System.out.println("Medio Estanque");
        } else if (cantidad >= 20 && cantidad < 35) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }
    }
}
