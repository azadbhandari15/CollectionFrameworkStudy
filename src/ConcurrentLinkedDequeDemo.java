import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeDemo {
    public static void main(String[] args) {
        //Non Therad Safe Double Ended Queue
        ConcurrentLinkedDeque<String> deque=new ConcurrentLinkedDeque<>();
        deque.add("Element1");
        deque.addFirst("Element0");
        deque.addLast("Element3");
    }
}
