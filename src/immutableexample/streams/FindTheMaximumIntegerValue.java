package immutableexample.streams;

import java.util.Arrays;
import java.util.List;

public class FindTheMaximumIntegerValue {
    public static void main(String[] args) {
        List<Integer> integersList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Integer integer = integersList.stream().min(Integer::compare).get();
        System.out.println(integer);
    }
}
