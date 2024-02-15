package ClasesWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 24000;
        Integer intObjeto =  Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTv = "12345";
        Integer valor = Integer.valueOf(valorTv); // de string a valor entero
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue(); // este solo aguanta hasta 32768
        System.out.println("shortObjeto = " + shortObjeto);

        Byte byteObjeto = intObjeto.byteValue(); // el maximo es 127
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
