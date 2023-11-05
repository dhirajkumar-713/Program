package immutableexample.streams;


import java.util.*;

public class TimePass {
    public static void main(String[] args) {
        /*Set <Integer> integerSet=new HashSet<>();
        integerSet.add(1);
        System.out.println(integerSet.size());
        System.out.println(integerSet.add(1));
        integerSet.add(2);
        System.out.println(integerSet.size());*/
        /*Map<String,String> map=new HashMap<>();
        System.out.println(map.put("a","b"));
        System.out.println(map.put("c","d"));
        System.out.println(map);
        System.out.println(map.put("a","e"));
        System.out.println(map);*/

        List<String> stringList=new LinkedList<>();
        stringList.add("a");
        stringList.add("b");

        List<String> stringListA=new ArrayList<>();
        stringListA.add("a");
        stringListA.add("b");
    }
}
