package streamspractical;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        System.out.println(input.chars().mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() == 1)
                        .map(e->e.getKey())
                .findFirst().get());
        //  input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)));
    }
}
