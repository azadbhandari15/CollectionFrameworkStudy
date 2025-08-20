import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) throws InterruptedException {
        Hashtable<Integer,String> hashtable=new Hashtable<>();
//        hashtable.put(1,"One");
//        hashtable.put(2,"Two");
//        hashtable.put(3,"Three");
//        hashtable.put(4,"Four");
//        System.out.println(hashtable);
//        System.out.println(hashtable.get(3));
//        System.out.println(hashtable.containsKey(3));
//        System.out.println(hashtable.remove(2));
        HashMap<Integer,String> map=new HashMap<>();

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                map.put(i,"Thread"+i);
                hashtable.put(i,"Thread"+i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=1000;i<2000;i++){
                map.put(i,"Thread"+i);
                hashtable.put(i,"Thread"+i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map.size());
        System.out.println(hashtable.size());
    }
}
