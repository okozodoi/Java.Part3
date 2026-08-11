package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {

    public static List<String> returnOnlyLetters(Map<String,List<String>> people) {
        return people.values().stream()
                .flatMap(List::stream)
                .filter(s->s.length()==1). collect(Collectors.toList());
    }

    public static Map<String,List<String>> returnPeople() {
        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123","s", "555-3389", "a"));
        people.put("Mary", Arrays.asList("555-2243","z", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242", "d"));

        return people;
    }

    public static void main(String[] args) {
        Map<String, List<String>> people = returnPeople();

        System.out.println(returnOnlyLetters(people));

    }
}
