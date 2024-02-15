package org.daniel.pooclasesbastractas.form;

import org.daniel.pooclasesbastractas.form.elementos.*;
import org.daniel.pooclasesbastractas.form.elementos.select.Opcion;
import org.daniel.pooclasesbastractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("calve", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(5,10));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java"))
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "Typescript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtmla() {
                return "<input disable name='" + this.nombre +"' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal estoy deshabilitado");
        username.setValor("dani.da");
        password.setValor("123123");
        email.setValor("dasdas@hotmaill.com");
        edad.setValor("25");
        experiencia.setValor("... mas de 2 anios de experiencia ...");
        //java.setSelected(true);
        //typeScript.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach(e ->{
            System.out.println(e.dibujarHtmla());
            System.out.println("<br>");
        });

        elementos.forEach(e ->{
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });

    }
}
