package StringCadenas;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Daniel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equals("Daniel"));
        System.out.println("nombre.equals(\"daniel\") = " + nombre.equals("daniel"));
        System.out.println("nombre.equalsIgnoreCase(\"daniel\") = " + nombre.equalsIgnoreCase("daniel"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(5));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));
        System.out.println("nombre.substring(1,4) = " + nombre.substring(4,6));
        System.out.println("nombre.charAt(0) = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"as\") = " + trabalenguas.endsWith("as"));
        System.out.println("  traba ");
        System.out.println("  traba ".trim());
    }
}
