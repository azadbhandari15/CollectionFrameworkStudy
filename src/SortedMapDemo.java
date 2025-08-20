import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String,Integer> sortedMap=new TreeMap<>((a,b)->b.length()-a.length());
        sortedMap.put("Vivek",90);
        sortedMap.put("Shubham",87);
        sortedMap.put("Mohit",95);
//        sortedMap.put(null,55);
//        System.out.println(sortedMap);
        System.out.println(sortedMap.headMap("Vivek"));
        System.out.println(sortedMap.tailMap("Shubham"));
        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.subMap("Shubham","Vivek"));

        NavigableMap<Integer,String> navigableMap=new TreeMap<>();
        navigableMap.put(3,"Three");
        navigableMap.put(1,"One");
        navigableMap.put(2,"Two");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(3));
        System.out.println(navigableMap.ceilingKey(3));

    }
}
