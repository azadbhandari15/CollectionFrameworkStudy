import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo  {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        Map<String,Integer> stringIntegerMap= Collections.unmodifiableMap(map);
//        stringIntegerMap.put("C",3);
        Map<String, Integer> map2 = Map.of("Shubham", 98, "Vivek", 89, "Rameshwar", 10);//limited to 10 variables
//        Map<K, V> kvMap = Map.ofEntries("Vivek", 99, "Rameshwar", 10, "aaba", 55);
        map2.put("Neha",66);
    }
}
