package streamspractical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15, 98);
        Set<Integer> setOfInteger = new HashSet<>();
        integerList.stream().filter(i -> !(setOfInteger.add(i))).collect(Collectors.toSet()).forEach(System.out::println);
    }
}
