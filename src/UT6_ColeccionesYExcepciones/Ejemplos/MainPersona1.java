package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.HashSet;

public class MainPersona1 {
    public static void main(String[] args) {
        Persona1 p1 = new Persona1("Ana", "123A");
        Persona1 p2 = new Persona1("Ana", "123A");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode() == p2.hashCode()); // true
        HashSet<Persona1> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p1);
        System.out.println(set.size()); // 1, porque son iguales según  equals()
    }
}
