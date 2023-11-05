package streamspractical;

import java.util.Arrays;
import java.util.List;

public class SortAnInteger {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        integerList.stream().sorted().forEach(System.out::println);
    }
}
