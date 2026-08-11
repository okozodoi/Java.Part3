package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Task4 {
    public static List<Integer> generateOneIntegerList(List<Integer> list1, List<Integer> list2, List<Integer> list3) {
        return Stream.of(list1,list2, list3).flatMap(List::stream).collect(Collectors.toList());
    }

    public static List<String> generateOneStringList(String[][] dataArray) {
        return Stream.of(dataArray).flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public static List<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        return numbers.stream().distinct().collect(Collectors.toList());
    }

    public static Map<Integer,Long> listCountIntegers(List<Integer> list) {
        return list.stream().collect(Collectors
                .groupingBy(n->n, counting()));
    }

    public static Map<Integer,Long> listToMap(List<Integer> list) {
        return list.stream().collect(Collectors.toMap(n->n,n->1L, Long::sum));
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);

        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};


        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7));

        System.out.println(generateOneIntegerList(list1,list2,list3));
        System.out.println(generateOneStringList(dataArray));
        System.out.println(removeDuplicates(numbersList));

        System.out.println(listCountIntegers(numbersList));
        System.out.println(listToMap(numbersList));
    }
}
