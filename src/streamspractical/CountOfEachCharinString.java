package streamspractical;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class CountOfEachCharinString {
    public static void main(String[] args) {
        String input = "India will win the World Cup";
        LinkedHashMap<String, Long> collect = Arrays.stream(input.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

        LinkedHashMap<String, Long> collect1 = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1);
    }
}
