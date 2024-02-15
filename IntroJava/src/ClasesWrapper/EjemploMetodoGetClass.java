package ClasesWrapper;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {

        String texto = "hola mundo";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }
        
        Integer num = 35;
        Class intClass = num.getClass();
        Class objclass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass.getSimpleName() = " + intClass.getSimpleName());
        System.out.println("intClass.getSimpleName() = " + intClass.getPackage());
        System.out.println("intClass.getSimpleName() = " + intClass.getSuperclass());
        System.out.println("intClass.getSimpleName() = " + objclass);

        for (Method metodo: objclass.getMethods()){
            System.out.println("metodo = " + metodo.getName());
        }
    }
}
