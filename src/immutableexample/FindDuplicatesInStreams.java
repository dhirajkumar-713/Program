package immutableexample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicatesInStreams {
    public static void main(String[] args) {
        List<String> liststring=new ArrayList<>();
        liststring.add("Dhirajkumar");
        liststring.add("Vijaylaxmi");
        liststring.add("Dhirajkumar");
        liststring.add("Kavita");
        liststring.add("Dhirajkumar");
        liststring.add("Rameshchand");

        List<String> listDistinct = liststring.stream().distinct().collect(Collectors.toList());
        for (String name:
             listDistinct) {
            liststring.remove(name);
        }
        System.out.println(liststring);
    }

}
