import javax.sound.midi.Track;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<String> queue=new SynchronousQueue<>();

        Thread producer=new Thread(()->{
           try{
                System.out.println("Producer is waiting to transfer....");
                queue.put("Producer Transfered the message");
           }catch (Exception e){
               Thread.currentThread().interrupt();
               System.err.println("Producer was interuppted");
           }
        });

        Thread consumer=new Thread(()->{
            try{
                System.out.println("Consumer is waiting to received....");
                String take = queue.take();
                System.out.println("Consumer received "+take);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interuppted");
            }
        });

        producer.start();
        consumer.start();

    }
}

