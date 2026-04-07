package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenacionEjemplo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> listEnteros = new ArrayList<>();
        listEnteros.add(5);
        listEnteros.add(1);
        listEnteros.add(9);
        Collections.sort(listEnteros);
        System.out.println(listEnteros);
        Collections.reverse(listEnteros);
        System.out.println(listEnteros);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(9);
        numbers.add(20);
        Collections.sort(numbers, (o1, o2) -> o1 - o2);
        System.out.println(numbers);
        Collections.sort(numbers, (o2, o1) -> o1 - o2);
        System.out.println(numbers);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Zob44", 44));
        people.add(new Person("aob11", 11));
        Collections.sort(people);
        System.out.println(people);

        ArrayList<String> items = new ArrayList<>();
        items.add("Banana");
        items.add("Apple");
        items.add("Orange");
        List<String> sortedItems = items.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedItems);

    }
}
class Person implements Comparable<Person> {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Person other) {
        //return this.age - other.age; // Ordenar por edad
        return this.name.compareTo(other.name); // Ordenar por edad
    }
    @Override
    public String toString() {
        return name + ": " + age;
    }
}
