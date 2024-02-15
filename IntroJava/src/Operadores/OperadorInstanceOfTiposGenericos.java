package Operadores;

public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Hola papito";

        Number num = Integer.valueOf(7); //123;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo object = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es del tipo Long = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es del tipo Double = " + b1);

        Number decimal = 43.45f;

        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo double = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo number = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);

        // b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo boolean = " + b1);
    }
}
