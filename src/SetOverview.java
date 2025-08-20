import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {

    public static void main(String[] args) {
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(67);
        set.add(10);
        set.add(65);
        System.out.println(set);
        set.clear();

        //For Thread Safety
//        Set<Integer> sets = Collections.synchronizedSet(set);
        Set<Integer>  set1=new ConcurrentSkipListSet<>();

        //Unmodifable
        Set<Integer> integers = Set.of(1, 2, 3, 4,5,6,7,8,9,10,11,12);
        Collections.unmodifiableSet(integers);

    }
}
