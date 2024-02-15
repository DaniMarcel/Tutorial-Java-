public class PrimitivosBoolean {
    public static void main(String[] args) {
        
        boolean datoLogico = false;
        System.out.println("datoLogico = " + datoLogico);

        double b = 543543.43e-3;
        System.out.println("b = " + b);
        
        float a = 1.234e2f;
        System.out.println("a = " + a);

        datoLogico = b > a;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = 3-2 == 1;
        System.out.println("esIgual = " + esIgual);
    }
}
