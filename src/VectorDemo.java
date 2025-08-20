import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(10,5);
        System.out.println(vector.capacity());
        for(int i=1;i<12;i++){
            vector.add(i);
        }
        System.out.println(vector.capacity());

        Vector<String> vector1=new Vector<>(Arrays.asList("1","2,","3"));
        System.out.println(vector1);
    }
}
