package Operadores;

import java.util.Scanner;

public class OperadoresLogicosLoginArreglo {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];
        usernames[0] = "daniel";
        passwords[0] = "123456";

        usernames[1] = "admin";
        passwords[1] = "admin";

        usernames[2] = "adminpepe";
        passwords[2] = "adminpepe";*/

        // otra forma
        String[] usernames = {"daniel", "admin", "adminpepe"};
        String[] passwords = {"123456", "admin", "adminpepe"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) )? true: esAutenticado;


            /*if ( usernames[i].equals(u) && passwords[i].equals(p) ){
                esAutenticado = true;
                break;
            }*/
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!"):
                "username o password incorrecto! \nLo siento, requiere autentificacion";
        System.out.println("mensaje = " + mensaje);

        /*if (esAutenticado == true){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));

        } else {
            System.out.println("username o password incorrecto!");
            System.out.println("Lo siento, requiere autentificacion" );
        }*/
    }
}
