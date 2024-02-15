package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Hola papito";

        Integer num = 123;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo string = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es del tipo object = " + b1);

        b1 = num instanceof Integer;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es del tipo object = " + b1);

        Double decimal = 43.45;
        b1 = decimal instanceof Number;
        System.out.println("decimas es del tipo number = " + b1);

        // b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo boolean = " + b1);
    }
}
