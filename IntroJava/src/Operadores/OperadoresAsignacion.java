package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        int a = 5;
        int b = a + 55;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += 2; // i = i + 2
        System.out.println("a = " + a);

        a += 10; // a = a + 10
        System.out.println("a = " + a);

        a -= 4; // a = a - 4
        System.out.println("a = " + a);

        a *=6; // a = a * 6
        System.out.println("a = " + a);

        // tambien se puede hacer con string
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Daniel";
        sqlString += " amd c.activo=1";
        System.out.println("sqlString = " + sqlString);

    }
}
