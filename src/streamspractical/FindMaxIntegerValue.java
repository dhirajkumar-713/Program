package streamspractical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxIntegerValue {
    public static void main(String[] args) {
        /* The below code is for Array List of Integers */
        List<Integer> integers = Arrays.asList(9, 7, 5, 3, 2, 88, 65, 45, 21);
        Integer integer = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer);
        /* The below code is for integer array */
        int[] intarray = {9, 7, 5, 3, 2, 88, 65, 45, 21};
        int asInt = Arrays.stream(intarray).max().getAsInt();
        System.out.println(asInt);
    }
}
