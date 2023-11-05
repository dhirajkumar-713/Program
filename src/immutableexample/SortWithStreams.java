package immutableexample;

import java.util.Arrays;
import java.util.Comparator;

public class SortWithStreams {
    public static void main(String[] args) {
        int[] numbers={4,7,8,1,9,2,3};
        int asInt = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(asInt);

        System.out.println(Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
