import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int captacity;
    public LRUCache(int initialCapacity) {
        super(initialCapacity, 0.75f,true);
        this.captacity=initialCapacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > captacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> studentMap=new LRUCache<>(3);
        studentMap.put("Bob",99);
        studentMap.put("Alice",89);
        studentMap.put("Ram",91);
        studentMap.get("Bob");
        studentMap.put("Vipul",89);
        studentMap.get("Bob");
        System.out.println(studentMap);
    }
}
