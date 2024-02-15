package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre Incremento
        int a = 1;
        int b = ++a; // a = a + 1
        System.out.println("b = " + b);

        // Post Incremento
        a = 2;
        System.out.println("inicial de a = " + a);
        b = a++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Pre Decremento
        a = 3;
        System.out.println("a = " + a);
        b = --a; // a = a - 1
        System.out.println("b = " + b);

        // Post Demecremento
        a = 4;
        b = a--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
