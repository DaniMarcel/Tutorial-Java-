package ClaseMath;

public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        int absoluto1 = Math.abs(3);
        System.out.println("absoluto1 = " + absoluto1);
        
        double max = Math.max(3.7,2.6);
        System.out.println("max = " + max);

        double min = Math.min(3.7,2.6);
        System.out.println("min = " + min);
        
        // redondeo hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // redondeo hacia abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        // redondear automatico
        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        // TRIGONOMETRIA
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(2.56);
        grados = Math.round(grados); // redondear
        System.out.println("convertir radianes a grados = " + grados);
        
        double radianes = Math.toRadians(90.00);
        //radianes = Math.round(radianes);
        System.out.println("convertir grados a radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180): " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("cos(0.00): " + Math.cos(radianes));

    }
}
