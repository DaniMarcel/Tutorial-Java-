package StringCadenas;

public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if (esNulo){
            curso = "Programacion java";
            //curso = " ";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco == false){
            System.out.println(curso.toUpperCase());

            // no podemos concatenar un valor con un nulo
            System.out.println("Bienvenido al curso ".concat(curso));

            // pero si podemos sumarlo
            System.out.println("Bienvenido al curso " + curso);
        }


    }
}
