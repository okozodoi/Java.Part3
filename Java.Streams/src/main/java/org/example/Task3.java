package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static List<String> aWordsWithLengthFive(List<String> list) {
        List<String> result = list.stream().filter(s-> s.startsWith("A")&& s.length()>5)
                .map(String::toLowerCase).sorted().collect(Collectors.toList());
        return result;
    }

    public static long countWords(List<String> membernames, String letter) {
        long count = membernames.stream().filter(s->s.startsWith(letter)).count();
        return count;
    }

    public static String firstName(List<String> membernames, String letter) {
        String firstName = membernames.stream()
                .filter(s->s.startsWith(letter))
                .findFirst()
                .orElse("no such name");
        return firstName;
    }

    public static List<String> memberNames() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Abibaba");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        return memberNames;
    }

    public static void main(String[] args) {

        List<String> memberNames = memberNames();

        System.out.println(aWordsWithLengthFive(memberNames));

        System.out.println(countWords(memberNames, "A"));

        System.out.println(firstName(memberNames, "L"));
    }
}

