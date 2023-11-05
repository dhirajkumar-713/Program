package immutableexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Testing {
    public static void main(String[] args) {
        final ArrayList list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        final Map<String,String> finalMap=new HashMap<>();
        finalMap.put("a","c");
        finalMap.put("e","f");
        System.out.println(finalMap);
    }
}
