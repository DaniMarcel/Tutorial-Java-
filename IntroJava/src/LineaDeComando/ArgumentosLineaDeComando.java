package LineaDeComando;

public class ArgumentosLineaDeComando {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++){
            System.out.println("argumentos n " + i + ": " + args[i]);
        }
    }
}
