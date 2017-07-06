package com.ericsson.unit3;

import com.ericsson.unit1.Person;

import java.util.Arrays;
import java.util.List;

/**
 * Created by smcgrath on 7/6/2017.
 */
public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Mathew", "Arnold", 39)
        );
        System.out.println("for loop search");
        for (int i = 0; i< people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println("for each loop");
        for(Person p : people){
            System.out.println(p);
        }
        System.out.println("lambda internal iterator loop");

        people.forEach(System.out::println);
    }

}
