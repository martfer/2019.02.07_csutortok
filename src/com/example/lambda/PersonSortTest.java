package com.example.lambda;

import java.util.Arrays;
import java.util.List;

import static com.example.lambda.Person.Gender.FEMALE;
import static com.example.lambda.Person.Gender.MALE;

public class PersonSortTest {

    public static void main(String[] args) {
        List<Person> pl = createPeopleList();

    }


    public static List<Person> createPeopleList() {
        return Arrays.asList(
                new Person("Sara", FEMALE, 20),
                new Person("Sara", FEMALE, 22),
                new Person("Bob", MALE, 20),
                new Person("Paula", FEMALE, 32),
                new Person("Paul", MALE, 32),
                new Person("Jack", MALE, 2),
                new Person("Jack", MALE, 72),
                new Person("Jill", FEMALE, 12)

        );
    }
}
