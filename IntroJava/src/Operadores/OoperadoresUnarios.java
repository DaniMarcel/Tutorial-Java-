package Operadores;

public class OoperadoresUnarios {
    public static void main(String[] args) {

        int a = -5;

        int b = +a; // b = (1)*a => -5
        System.out.println("b = " + b);

        int c = -a; // c = (-1)*a => 5
        System.out.println("c = " + c);

        a = 6;
        b = +a;
        System.out.println("b = " + b);

        c = -a;
        System.out.println("c = " + c);
    }
}
