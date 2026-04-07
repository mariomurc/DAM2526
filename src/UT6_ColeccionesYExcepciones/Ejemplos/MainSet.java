package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
/*
 /// Declaramos el Set (interfaz + implementación)
        Set<String> alumnos = new HashSet<>();
// Añadimos nombres (con duplicados)
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("María");
        alumnos.add("Ana"); // repetido
        alumnos.add("Luis"); // repetido
        alumnos.add("Carlos");
       // Mostramos el contenido
        System.out.println("Alumnos en el Set:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
        // Tamaño del Set
        System.out.println("Total alumnos únicos: " + alumnos.size());
        alumnos.remove("María");
        System.out.println("Total alumnos únicos: " + alumnos.size());*/

        Set<Alumno> alumnos1 = new HashSet<>();
        alumnos1.add(new Alumno("Ana", 20));
        alumnos1.add(new Alumno("Luis", 22));

        alumnos1.add(new Alumno("Ana", 20)); // duplicado lógico

        System.out.println("Contenido del Set:");
        for (Alumno a : alumnos1) {
            System.out.println(a);
        }
        System.out.println("Total: " + alumnos1.size());
// Tamaño del Set
        System.out.println("Total alumnos únicos: " + alumnos1.size());
    }
}
