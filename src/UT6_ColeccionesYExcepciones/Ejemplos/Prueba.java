package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
      /*  ArrayList lista = new ArrayList();
        System.out.println(lista.isEmpty());
        lista.add("Mario");
        lista.add("Murias");
        lista.add(45);
        lista.add(1330.3);
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        lista.add(new Persona());
        lista.add(new Persona());
        lista.add(new Persona());
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        Iterator iter = lista.iterator(); // Creamos el Iterator a partir de la lista
        while(iter.hasNext()) { // Mientras haya siguiente en la lista
            System.out.println(iter.next()); // Lo imprimimos por pantalla
        }

        for (Object o : lista) {
            System.out.println(o);
        }



        lista.forEach((o->{
            System.out.println(o);
        }));

        ArrayList<String> lista1 = new ArrayList();

        lista1.add("Laura");
        lista1.add("Mario");
        lista1.add("Ana");

        for (String s : lista1) {
            System.out.println(s);
        }*/
        ArrayList<Persona> lista2 = new ArrayList<Persona>();

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantos Persona quieres?");
        Integer n = teclado.nextInt();

        for (int i = 0; i < n; i++) {
            lista2.add(new  Persona());
        }
        teclado.nextLine();
        for ( Persona persona : lista2) {
            persona.setNombre(teclado.nextLine());
        }

        Iterator< Persona> iter1;
        iter1 = lista2.iterator(); // Creamos el Iterator a partir de la lista
        while(iter1.hasNext()) { // Mientras haya siguiente en la lista
            iter1.next().mostrarPersona(); // Lo imprimimos por pantalla
        }

        Persona p = lista2.remove(1);

        iter1 = lista2.iterator(); // Creamos el Iterator a partir de la lista
        while(iter1.hasNext()) { // Mientras haya siguiente en la lista
            iter1.next().mostrarPersona(); // Lo imprimimos por pantalla
        }

        System.out.println(lista2.remove(p));













    }
}
