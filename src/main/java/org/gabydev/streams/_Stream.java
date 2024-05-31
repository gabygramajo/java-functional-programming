package org.gabydev.streams;


import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static org.gabydev.streams._Stream.Gender.*;

public class _Stream {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", NO_BINARY),
                new Person("Sasha", FEMALE),
                new Person("Alex", MALE),
                new Person("Emma", PREFER_NOT_TO_SAY),
                new Person("Alice", FEMALE)
        );

       /* people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/

        // example 1

        /*Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> stringToIntFunction = String::length;
        IntConsumer println = System.out::println;

        people.stream()
                .map(personStringFunction)
                .mapToInt(stringToIntFunction)
                .forEach(println);*/

        // clean code

        /*people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);*/

        // other stream methods
        System.out.println("ASC: ");
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .sorted(Comparator.comparing(person -> person.name))
                .forEach(person -> System.out.println(person.name));

        System.out.println("\nDESC: ");
        people.stream()
                .filter(person -> FEMALE.equals(person.getGender()))
                .sorted(Comparator.comparing(Person::getName).reversed())
                .forEach(person -> System.out.println(person.getName()));

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Gender getGender() {
            return gender;
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
        MALE, FEMALE, NO_BINARY, PREFER_NOT_TO_SAY
    }
}
