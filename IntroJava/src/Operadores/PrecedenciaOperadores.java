package Operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int a = 12;
        int b = 31;
        int c = 53;

        double promedio = (a + b + c) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (a + b + c) / 3d * 10; // 14 + 8 + 0.6
        System.out.println("promedio = " + promedio);

        promedio = ++a + b-- + c / 3d * 10; // (15 + 8) + 6.66
        System.out.println("promedio = " + promedio);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
