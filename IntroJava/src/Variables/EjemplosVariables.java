public class EjemplosVariables {
    public static void main(String[] args) {
        
        String nombre = "Daniel";
        String apellido = "Marcel";
        System.out.println("Me presento, yo soy: " + nombre.toUpperCase() + " " + apellido.toUpperCase());
        
        int numero = 25;
        System.out.println("numero = " + numero);
        
        boolean valor = true;
        int numero2 = 5;
        if (valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = 56 + "54";

        String nombre1;
        nombre1 = "Andres";
        if (numero > 25){
            nombre1 = "Puerco";
        }
        System.out.println("nombre1 = " + nombre1);

        // Comentario de una linea
        /* bloque completo */
    }
}

