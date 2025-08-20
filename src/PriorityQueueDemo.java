import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(15);
        queue.add(20);
        queue.add(30);
        queue.add(5);

//        System.out.println(queue.remove());
//        System.out.println(queue.peek());

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        //internal working
        Queue<Integer> queue1=new PriorityQueue<>(Collections.reverseOrder());
        queue1.add(15);
        queue1.add(20);
        queue1.add(30);
        queue1.add(5);
        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}
