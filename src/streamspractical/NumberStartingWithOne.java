package streamspractical;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        integerList.stream().map(s->s+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    }
}
