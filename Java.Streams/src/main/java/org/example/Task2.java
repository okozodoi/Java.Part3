package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static Integer[] evenNumbersArray(List<Integer> list) {
        Integer[] result = list.stream()
                .filter(i->i%2==0)
                .toArray(Integer[]::new);
        return result;
    }

    public static List<String> listOfDescendingC(List<String> list) {
        List<String> result = list.stream()
                .filter(s->s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return result;
    }



    public static void main(String[] args) {
        List<Integer> randoms = Task1.randomNumbers();
        Integer[] evens = evenNumbersArray(randoms);
        System.out.println(Arrays.toString(evens));

        List<String> stringList = Arrays.asList("a1", "a2", "b1", "c1", "c3");
        List<String> cWords = listOfDescendingC(stringList);
        System.out.println(cWords);
    }
}
