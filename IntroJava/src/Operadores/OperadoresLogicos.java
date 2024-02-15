package Operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {

        int a = 3;
        byte b = 7;
        float c = 123e-4f;
        double d = 2.1234e3;
        boolean e = false;

        boolean a1 = a == b && c > d && e == true; // si una condicion falla, todas fallan
        System.out.println("a1 = " + a1);

        boolean a2 = a == b || c < d; // si una condicion se cumple, todo se cumple
        System.out.println("a2 = " + a2);

        boolean a3 = a == b && c < d || e == false;
        System.out.println("a3 = " + a3);

        boolean a4 = a == b && c < d || (e == true);
        System.out.println("a4 = " + a4);


        // Precedecia en los operadores logicos
        boolean a5 = a == b || c < d && e == true; // primero resuelve el and
        System.out.println("a5 = " + a5);

        boolean a6 = true || true && false;
        System.out.println("a6 = " + a6);

        boolean a7 = (true || true) && false;
        System.out.println("a7 = " + a7);
        
        boolean a8 = true || false && false || false; // true ya que primero evalua el and
        System.out.println("a8 = " + a8);

        boolean a9 = ((true || false) && false) || false; // false ya que primero evaluara el ()
        System.out.println("a9 = " + a9);
    }
}
