package ValorReferencia;

class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }
}

public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Daniel");

        System.out.println("iniciamos el metodo main");

        System.out.println("persona = " + persona.leerNombre());

        System.out.println("antes de llamar al metodo test");
        test(persona);

        System.out.println("despues de llamar al metodo test");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("finaliza el metodo main con los datos de la pesona modificada");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("Andres");
        System.out.println("Finaliza el metodo test");
    }
}
