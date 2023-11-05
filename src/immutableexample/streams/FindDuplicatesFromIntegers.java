package immutableexample.streams;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicatesFromIntegers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> integerSet=new HashSet<>();
        List<Integer> duplicates = integers.stream().filter(i -> !(integerSet.add(i))).collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
