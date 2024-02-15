package Operadores;

import javax.swing.*;

public class OperadoresAritmetico {
    public static void main(String[] args) {

        int a = 10, b = 15, suma = a + b;
        System.out.println("suma = " + suma);
        System.out.println("(a + b) = " + (a + b));
        
        int resta = a - b;
        System.out.println("resta = " + resta);
        System.out.println("(a - b) = " + (a - b));

        int multip = a * b;
        System.out.println("multiplicacion = " + multip);

        int div = a / b;
        float div2 = (float) a / b;
        System.out.println("division = " + div);
        System.out.println("div2 = " + div2);

        int resto = a % b;
        System.out.println("resto = " + resto);
        
        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0){
            System.out.println("numero es par = " + numero);
        } else {
            System.out.println("numero es impar = " + numero);
        }
    }
}
