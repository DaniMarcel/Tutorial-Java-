package DateCalendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese una fecha con formato dd-MM-yyyy: ");
        String fechaStr = s.next();

        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaNacimiento = df.parse(fechaStr);
        Date actual = new Date();

        // creamos un patros de fecha numero con el anio, mes y dia
        df = new SimpleDateFormat("yyyyMMdd");

        // convertimos ambas fechas la actual y nacimiento en enteros que contiene el anio mes y dia
        int desde = Integer.parseInt(df.format(fechaNacimiento));
        int hasta = Integer.parseInt(df.format(actual));

        // restamos ambas fechas y las dividimos en 10000 para quitar decimales
        // y dejar la fecha en decenas o centenas
        int edad = (hasta - desde) / 10000;

        System.out.println("la edad es: " + edad);

    }
}
