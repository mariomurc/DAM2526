package UT5_POOII.Ej1FigGeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Punto centro = new Punto(5, 5);
            Circulo c = new Circulo(centro, 8, "azul", false, null);

            System.out.println("Circulo creado");
            System.out.println("************CARACTERÍSTICAS DEL CIRCULO***********");
            System.out.println(c.toString());
            System.out.println("Perimetro: " + c.perimetro());
            System.out.println("Diametro: " + c.diametro());

            Punto p1 = new Punto(2, 2);
            Punto p2 = new Punto(7, 7);

            Rectangulo r = new Rectangulo(p1, p2, "verde", true, "lunares");
            System.out.println("************CARACTERÍSTICAS DEL RECTANGULO***********");
            System.out.println(r.toString());
            System.out.println("Rectangulo creado");
            System.out.println("Perimetro: " + r.perimetro());




    }
}