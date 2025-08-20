import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        System.out.println(hashMap);
        System.out.println(hashMap.get("key1"));
        System.out.println(hashMap.containsKey("key"));
        System.out.println(hashMap.containsValue("value1"));

        hashMap.keySet().forEach(map->{
            System.out.println(map);
        });

        hashMap.entrySet().forEach(map->{
            System.out.println(map);
        });



        hashMap.remove("key1");
        System.out.println(hashMap);
        hashMap.remove("key2","value1");
        System.out.println(hashMap);
        hashMap.remove("key2","value2");
        System.out.println(hashMap);
    }
}
