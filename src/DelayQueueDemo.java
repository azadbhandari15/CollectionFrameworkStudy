import java.sql.Time;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueDemo {
    public static void main(String[] args) throws Exception {
        //Thread Safe unbounded blocking queue
        //Elements can only be taken from the queue when their delay has expired
        //Useful for scheduling tasks to be executed after a certain delay
        //Internally priority queue is used

        BlockingQueue<DelayedTask> queue=new DelayQueue<>();
        queue.put(new DelayedTask("Task 1",TimeUnit.SECONDS,5));
        queue.put(new DelayedTask("Task 2",TimeUnit.SECONDS,10));
        queue.put(new DelayedTask("Task 3",TimeUnit.SECONDS,3));

        while (!queue.isEmpty()){
            DelayedTask task=queue.take();//Block until task get expired
            System.out.println("Executed "+task.getTaskName() + " at "+System.currentTimeMillis());
        }
    }


}

class DelayedTask implements Delayed {

    private final String taskName;
    private final long startTime;

    DelayedTask(String taskName, TimeUnit unit,long delay) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis()+unit.toMillis(delay);
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining=startTime-System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if(this.startTime<((DelayedTask)o).startTime){
            return -1;
        }
        if(this.startTime>((DelayedTask)o).startTime){
            return 1;
        }
        return 0;
    }

    public String getTaskName() {
        return taskName;
    }
}


