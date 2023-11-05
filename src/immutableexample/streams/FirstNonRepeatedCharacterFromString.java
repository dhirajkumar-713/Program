package immutableexample.streams;

import com.sun.jdi.CharValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterFromString {
    public static void main(String[] args) {
        String input = "Java Hungry Blog Alive is Awesome";
        System.out.println(input.chars().mapToObj(s-> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(k->k.getValue()==1L).map(e->e.getKey()).collect(Collectors.toList()));
        input.chars().mapToObj(s-> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().filter(k->k.getValue()==1L).map(e->e.getKey()).collect(Collectors.toList());
    }
}
