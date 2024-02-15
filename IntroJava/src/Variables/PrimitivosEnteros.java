public class PrimitivosEnteros {
    public static void main(String[] args) {

        // es el entero más pequeño en java
        // tamano maximo 127
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("tipo byte corresponde en byte a = " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a = " + Byte.SIZE);
        System.out.println("valor maximo de byte corresponde a = " + Byte.MAX_VALUE);
        System.out.println("valor minimo de byte corresponde a = " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo short corresponde en byte a = " + Short.BYTES);
        System.out.println("tipo short corresponde en bites a = " + Short.SIZE);
        System.out.println("valor maximo de short corresponde a = " + Short.MAX_VALUE);
        System.out.println("valor minimo de short corresponde a = " + Short.MIN_VALUE);

        int numeroInt = 50000;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a = " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a = " + Integer.SIZE);
        System.out.println("valor maximo de int corresponde a = " + Integer.MAX_VALUE);
        System.out.println("valor minimo de int corresponde a = " + Integer.MIN_VALUE);

        long numeroLong = 214748364754353L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a = " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a = " + Long.SIZE);
        System.out.println("valor maximo de long corresponde a = " + Long.MAX_VALUE);
        System.out.println("valor minimo de long corresponde a = " + Long.MIN_VALUE);

        var numeroVar = 2147483647543535435D;
    }
}
