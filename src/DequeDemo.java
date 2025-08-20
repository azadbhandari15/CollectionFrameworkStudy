import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {

        Deque<Integer> deque1=new ArrayDeque<>();//Faster Iteration, low memory, no null allowed
        //circular head and tail
        //No Need to shift elements, just shift head and tail


        deque1.addFirst(10);
        deque1.addFirst(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);


        System.out.println("First Element "+deque1.getFirst());//5
        System.out.println("Last Element "+deque1.getLast());//10
        //5,10,20,25

        deque1.removeFirst();//Removes 5
        deque1.pollLast();//Removes 25
        //10,25
        for(int num:deque1){
            System.out.println(num);
        }
        Deque<Integer> deque=new LinkedList<>();
    }
}
