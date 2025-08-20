import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {

        //Queue Using LinkedList
//        Queue<Integer> list=new LinkedList<>();
//        list.add(10);//enqueue
//        list.add(20);
//        list.add(30);
//
//        list.remove();//Dequeue
//        list.remove();
//        System.out.println(list);
//        list.peek();//peek
//        System.out.println(list);

        //Queue
        Queue<Integer> queue=new LinkedList<>();
        queue.add(100);
//        queue.remove();//Throws Exception
        queue.poll();
        queue.peek();
//        queue.element();//Throws Exception
        Queue<Integer> queue1=new ArrayBlockingQueue<>(2);
        queue1.add(2);//true
        queue1.offer(2);//true
//        queue1.add(3);//No Such Element Exception
        queue1.offer(3);//false
    }
}
