package streamspractical;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class CheckListIsEmptyOrNot {
    public static void main(String[] args) {
        List<Integer> integerList = List.of();
        Stream<Integer> integerStream = Optional.ofNullable(integerList)
                .orElseGet(Collections::emptyList)
                .stream().filter(i -> true);
        integerStream.forEach(System.out::println);

    }
}
