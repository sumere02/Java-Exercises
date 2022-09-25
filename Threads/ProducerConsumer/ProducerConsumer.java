import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class ProducerConsumer {
    Random random = new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
    
    public void produce(){
        while(true){
            try {
                Thread.sleep(1000);
                Integer value = random.nextInt(100);
                System.out.println("Producer is currently producing value: " + value);
                queue.put(value);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public void consume(){
        while(true){
            try {
                Thread.sleep(5000);
                Integer value = queue.take();
                System.out.println("Consumer is currently consuming a value: " + value);
                System.out.println(queue.size());
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
