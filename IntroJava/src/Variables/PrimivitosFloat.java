public class PrimivitosFloat {

    static float varFlotante2;

    public static void main(String[] args) {
        
        float realFloat = 1.5e4f; //15000f;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float correspondiente en byte a = " + Float.BYTES);
        System.out.println("float correspondiente en bites a a = " + Float.SIZE);
        System.out.println("valor maximo de float = " + Float.MAX_VALUE);
        System.out.println("valor minimo de float = " + Float.MIN_VALUE);

        /*float realFloat2 = 1.5e-10f; //0.00000000015f;
        System.out.println("realFloat = " + realFloat2);*/

        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double correspondiente en byte a = " + Double.BYTES);
        System.out.println("double correspondiente en bites a a = " + Double.SIZE);
        System.out.println("valor maximo de double = " + Double.MAX_VALUE);
        System.out.println("valor minimo de double = " + Double.MIN_VALUE);

        var varFlotante = 1.7976931348623157E308;
        System.out.println("varFlotante = " + varFlotante);

        System.out.println("varFlotante = " + varFlotante2);
    }
}
