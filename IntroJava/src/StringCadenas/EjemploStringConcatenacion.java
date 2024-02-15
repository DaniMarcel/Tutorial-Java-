package StringCadenas;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        
        String curso = "Programacion java";
        String estudiante = "Daniel Marcel";
        
        String detalle = curso + " con el estudiante " + estudiante;
        System.out.println(detalle);

        int numeroA = 15;
        int numeroB = 54;

        System.out.println(detalle + (numeroA + numeroB));

        // aca hace primero la suma, ya que va por orden
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con ").concat(estudiante);
        System.out.println("detalle2 = " + detalle2);

    }
}
