package StringCadenas;

public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++){
            System.out.print(arreglo[i]);
        }

        System.out.println();
        System.out.println("trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        System.out.println("l = " + l);

        for (int o = 0; o < l; o++){
            System.out.println(arreglo2[o]);
        }

        String archivo = "alguna.imagen.png";
        String[] archivoArr = archivo.split("\\."); // [.]
        l = archivoArr.length;
        System.out.println(l);
        for ( int p = 0; p < l; p++){
            System.out.println(archivoArr[p]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
