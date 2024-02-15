public class EjemploMatricesStringFor {
    public static void main(String[] args) {

        String[][] nombres = new String[3][2];
        nombres[0][0] = "pepe";
        nombres[0][1] = "pepa";
        nombres[1][0] = "daniel";
        nombres[1][1] = "andres";
        nombres[2][0] = "lucas";
        nombres[2][1] = "pancha";

        System.out.println("Iterando con for: ");
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Iterando con forEach: ");
        for (String[] fila: nombres){
            for (String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
    }
}
