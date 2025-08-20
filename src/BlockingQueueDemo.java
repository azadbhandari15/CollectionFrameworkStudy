import javax.swing.plaf.TableHeaderUI;
import java.time.temporal.Temporal;
import java.util.concurrent.*;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value=0;
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }


    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Producer Produced: " + value);
                queue.put(value++);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
            System.out.println("Producer Interupted");
        }
    }
}

class ConsumerTest implements Runnable{
    private BlockingQueue<Integer> queue;

    public ConsumerTest(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer value=queue.take();
                System.out.println("Consumer Consumer: " + value);
//                queue.put(value);
                Thread.sleep(2000);
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
            System.out.println("Consumer Interuppted");
        }
    }
}
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
        //A Bounded Queue backed by array
        //Low Memory Overhead
        //Single Lock for enque and deque operations
        Thread producer=new Thread(new Producer(queue));
        Thread consumer=new Thread(new ConsumerTest(queue));
        producer.start();
        consumer.start();

        BlockingQueue<Integer> queue1=new LinkedBlockingQueue<>();
        //Optionally Bounded backed by linked list
        //Uses Two Separate locks for enque and deque
        //Higher Concurrency between consumer and producer

        BlockingQueue<String> queue2=new PriorityBlockingQueue<>();
        //Unbounded
        //Binary Heap as an array grow dynamically
        //Elements are based on their natural order or a provided comparator
        //Put won't block
        //Head is based on their natural ordering or provided comparator like priority queue
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);

        BlockingQueue<Integer> queue3=new SynchronousQueue<>();
        //Each Insert operation must wait for a corresponding remove operation by another thread and vice versa
        //it cannot store elements, capacity at most one element

    }
}
