package FlujosDeControl;

public class SentenciaForEach {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        for (int num: numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"daniel", "dani", "andres", "andrew", "juan", "mari"};
        for (String nombre: nombres){
            System.out.println("nombre = " + nombre);
        }
    }
}
