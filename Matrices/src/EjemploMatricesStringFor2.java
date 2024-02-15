public class EjemploMatricesStringFor2 {
    public static void main(String[] args) {

        String[][] nombres = {{"pepe", "pepa"}, {"Daniel", "Andres"}, {"Lucas", "Pancha"}};

        System.out.println("Iterando con forEach: ");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
