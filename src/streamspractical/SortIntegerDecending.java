package streamspractical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortIntegerDecending {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
