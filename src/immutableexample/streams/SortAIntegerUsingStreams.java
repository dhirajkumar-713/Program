package immutableexample.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAIntegerUsingStreams {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        System.out.println(integersList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));
    }
}
