package streamspractical;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListContainsDuplicates {
    public static void main(String[] args) {
        /*List<Integer> integerList = Arrays.asList(1, 2, 3, 1);
        Arrays.stream(integerList).*/
        int[] arr = {1, 2, 3};
        List<Integer> integerList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Set<Integer> setOfNumber = new HashSet<>(integerList);

        if (integerList.size() == setOfNumber.size()) {
            System.out.println("Unique element present");
        } else {
            System.out.println("Duplicate element present");
        }
        System.out.println(integerList);
        System.out.println(setOfNumber);
    }
}
