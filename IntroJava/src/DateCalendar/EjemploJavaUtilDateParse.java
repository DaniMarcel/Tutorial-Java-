package DateCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con formato dd-MM-yyyy: ");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            // comparar fecha
            Date fecha2 = new Date();
            if (fecha.after(fecha2)){
                System.out.println("Fecha1 del usuario es despues de fecha2 (actual)");
            } else if (fecha.before(fecha2)) {
                System.out.println("Fecha1 del usuario es anterior que fecha2 (actual");
            } else if (fecha.equals(fecha2)){
                System.out.println("Fecha1 es igual a fecha2");
            }

            // otra forma
            if (fecha.compareTo(fecha2) > 0 ){
                System.out.println("Fecha1 del usuario es despues de fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) < 0 ) {
                System.out.println("Fecha1 del usuario es anterior que fecha2 (actual)");
            } else if (fecha.compareTo(fecha2) == 0 ) {
                System.out.println("Fecha1 es igual a fecha2");
            }


        } catch (ParseException e) {
            //throw new RuntimeException(e);
            System.err.println("La fecha tiene un formato incorrecto: " + e.getMessage());
            System.out.println("El formato debe ser 'dd-MM-yyyy'");
            //System.exit(1);
            //main(args);
        }
    }
}
