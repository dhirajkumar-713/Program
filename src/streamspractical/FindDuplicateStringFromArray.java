package streamspractical;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateStringFromArray {
    public static void main(String[] args) {
        /* This is one way of finding it out using the Collectors.groupingBy with three parameter */
        String[] arrayOfString={"AA","BB","AA","CC","DD","CC"};
        Arrays.stream(arrayOfString)
                .collect(Collectors.groupingBy(s->s, LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream().filter(e->e.getValue()>1)
                .collect(Collectors.toList()).forEach(System.out::println);

        /* This is another way of finding it out using the Collectors.groupingBy with Two parameter */
        List<String> listOfString=List.of("AA","BB","AA","CC","DD","CC");
       /* Map<String, Long> collect = listOfString.stream().filter(x -> Collections.frequency(listOfString, x) > 1)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/
        listOfString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue))
                .entrySet().stream().forEach(e-> System.out.println(e));
                ;

    }
}
