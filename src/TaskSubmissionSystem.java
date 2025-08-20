import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem {
    private static ConcurrentLinkedQueue<String> tastQueue=new ConcurrentLinkedQueue<>();
    public static void main(String[] args) throws Exception {

        Thread producer=new Thread(()->{
            while (true){
             try {
                 tastQueue.add("Task "+System.currentTimeMillis());
             }catch (Exception e){
                e.printStackTrace();
             }
            }
        });

        Thread consumer=new Thread(()->{
            while (true){
                try {
                    System.out.println("Task Poll "+tastQueue.poll());
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
