package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Paula", "Pedro",
                "Juan");

        List<String> filteredNames = names.stream()
                .filter(n -> n.startsWith("P"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames); // Output: [PAULA, PEDRO]

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);


        List<Person> personas= Arrays.asList(new Person("Juan",12),
                new Person("Ana",28),
                new Person("Luis",19),
                new Person("Jorge",10),
                new Person("Laura",20));
        List<Person> resultado3 =
                personas.stream()
                        .filter(p -> p.age >=18)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(resultado3);

        List<String> words = Arrays.asList("hello", "world");
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordLengths);

        /*List<String> wordsToMap = Arrays.asList("hello", "world", "bye");
        Map<String,Integer> wordsLengthMap = words.stream()
          */
        List<String> palabras = Arrays.asList("World","Hello","Bye", "World");
        Map<String, Integer> mapPalabras =
                palabras.stream()
                        .distinct()
                        .collect(Collectors.toMap(p -> p , p -> p.length()));
                System.out.println(mapPalabras);

    }
}

class PersonaStream  {
    String name;
    int age;
    PersonaStream(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ": " + age;
    }
}

