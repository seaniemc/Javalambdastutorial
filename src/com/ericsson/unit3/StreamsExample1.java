package com.ericsson.unit3;

import com.ericsson.unit1.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smcgrath on 7/6/2017.
 */
public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );

        people.stream()
                .filter(p -> p.getLastNmae().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));
    }
}
