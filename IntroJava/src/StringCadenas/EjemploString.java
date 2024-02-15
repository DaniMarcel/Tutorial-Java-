package StringCadenas;

public class EjemploString {
    public static void main(String[] args) {
        
        String curso = "Programacion java";
        String curso2 = new String("Programacion java");

        // este compara la referencia, el objeto
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);
        
        // equals compara el valor o atributo
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        // sin tomar en cuenta si es minuscula o mayuscula
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);
        
        String curso3= "Programacion java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
