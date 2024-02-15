package com.daniel.poosobrecarga;

import static com.daniel.poosobrecarga.Calculadora.*;

public class EjemploSobrecarga {
    public static void main(String[] args) {


        System.out.println("Sumar int: " + sumar(10,5));
        System.out.println("Sumar float: " + sumar(10.0F,5F));
        System.out.println("Sumar float-int: " + sumar(10F,5));
        System.out.println("Sumar int-float: " + sumar(10,5.0F));
        System.out.println("Sumar double: " + sumar(10.0,5.0));
        System.out.println("Sumar string: " + sumar("10","5"));
        System.out.println("Sumar tres int: " + sumar(10,5,20));

        System.out.println("Sumar varios int: " + sumar(10,5,20,25,30,35,50));
        System.out.println("Sumar varios double: " + sumar(10.0,5.0,20.0,25.0,30.0,35.0,50.0));

        System.out.println("Sumar long: " + sumar(10L,5L));
        System.out.println("Sumar int: " + sumar(10,'@'));
        System.out.println("Sumar float-int: " + sumar(10F,'@'));
    }
}
