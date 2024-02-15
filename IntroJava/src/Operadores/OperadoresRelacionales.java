package Operadores;

public class OperadoresRelacionales {
    public static void main(String[] args) {

        int a = 3;
        byte b = 7;
        float c = 123e-4f;
        double d = 2.1234e3;
        boolean e = false;

        boolean a1 = a == b;
        System.out.println("a1 = " + a1);

        boolean a2 = !a1;
        System.out.println("a2 = " + a2);

        boolean a3 = a != b; // <>
        System.out.println("a3 = " + a3);

        boolean a4 = e == true;
        System.out.println("a4 = " + a4);

        boolean a5 = e != true;
        System.out.println("a5 = " + a5);

        boolean a6 = a > b;
        System.out.println("a6 = " + a6);

        boolean a7 = a < b;
        System.out.println("a7 = " + a7);

        boolean a8 = (c >= d);
        System.out.println("a8 = " + a8);

        boolean a9 = c <= d;
        System.out.println("a9 = " + a9);
    }
}
