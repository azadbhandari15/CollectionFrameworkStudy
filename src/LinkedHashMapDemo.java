import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(11,0.3f,true);
        HashMap<String,Integer> hashMap=new HashMap<>();
        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Guava",20);
        linkedHashMap.put("Peach",30);
        linkedHashMap.get("Guava");

        System.out.println(linkedHashMap);

    }
}
