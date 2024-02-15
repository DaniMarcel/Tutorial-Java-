package Operadores;

import java.util.Scanner;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        int numero2 = scanner.nextInt();

        String resultado = (numero1 > numero2)? numero1 + " y " + numero2: numero2 + " y " + numero1;
        System.out.println("resultado = " + resultado);
    }
}
