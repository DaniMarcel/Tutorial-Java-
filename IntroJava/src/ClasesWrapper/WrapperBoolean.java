package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        
        Integer num1, num2;
        num1 = 1;
        num2 = 2;
        
        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("comparando 2 obj boolean: " + (objetoBoolean == objetoBoolean2));
        System.out.println("comparando 2 obj boolean: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("comparando 2 obj boolean: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("comparando 2 obj boolean: " + (objetoBoolean == objetoBoolean3));

        boolean primBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);
    }
}
