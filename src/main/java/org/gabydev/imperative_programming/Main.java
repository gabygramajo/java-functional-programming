package org.gabydev.imperative_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.gabydev.imperative_programming.Main.Gender.FEMALE;
import static org.gabydev.imperative_programming.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative approach
        System.out.println("#### Imperative approach #####");

        List<Person> females = new ArrayList<>();

        for (Person person: people) {
            if (FEMALE.equals(person.gender))
                females.add(person);
        }

        for (Person female : females) {
            System.out.println(female );
        }

        // Declarative approach
        System.out.println("#### Declarative approach #####");

        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String  toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
