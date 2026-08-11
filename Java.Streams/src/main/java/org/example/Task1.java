package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static List<Integer> fixedStreamToList() {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        return stream.collect(Collectors.toList());
    }

    public static List<Integer> randomNumbers() {
        Random random = new Random();
        List<Integer> result = Stream.generate(() -> random.nextInt(100))
                .limit(20)
                .collect(Collectors.toList());
        return result;
    }

    public static List<Integer> evenNumbers(List<Integer> list) {
        List<Integer> result = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        return result;
    }

    public static void main(String[] args) {
        List<Integer> stream = fixedStreamToList();
        System.out.println(stream);

        List<Integer> randoms = randomNumbers();
        System.out.println(randoms);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,12,13,54,43,0);
        List<Integer> evens = evenNumbers(list);
        System.out.println(evens);

    }
}
