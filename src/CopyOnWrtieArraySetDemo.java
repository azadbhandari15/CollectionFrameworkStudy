import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWrtieArraySetDemo {

    public static void main(String[] args) {
        //Thread Safe
        //Copy On Write Mechanism
        //Iterate Does not allow modifications
        CopyOnWriteArraySet<Integer> set=new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> set1=new ConcurrentSkipListSet<>();//Weakly Consistent
        for(int i=1;i<10;i++){
            set.add(i);
            set1.add(i);
        }

        for(Integer num:set){
            System.out.println(num);
            set.add(11);
        }

        for(Integer num1:set1){
            System.out.println(num1);
            set1.add(11);
        }
    }
}
