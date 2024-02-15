package FlujosDeControl;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        int num = 9; // soporta byte short int char string

        switch (num){
            case 0:
                System.out.println("el numero es 0");
                break;
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;
            default:
                System.out.println("no hay casos");
        }
    }
}
