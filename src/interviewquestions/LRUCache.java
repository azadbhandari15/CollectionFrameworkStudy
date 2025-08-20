package interviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final Integer capacity;

    public LRUCache(Integer capacity) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size()>capacity;
    }

    public static void main(String[] args) {
        LRUCache<Integer,Integer> lruCache=new LRUCache<>(2);
        lruCache.put(10,1);
        lruCache.put(20,2);
        lruCache.get(10);
        lruCache.put(30,3);
        System.out.println(lruCache);
    }
}
