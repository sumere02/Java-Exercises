import java.util.Random;
import java.util.LinkedList;
import java.util.Queue;


public class ProducerConsumer {
    private Object lock = new Object();
    private Random random = new Random();
    private Queue<Integer> queue = new LinkedList<Integer>();
    private int limit = 10;

    public void produce(){
        while(true){
            try {
                Thread.sleep(1000);
                synchronized(lock){
                    if(queue.size() == limit){
                        lock.wait();
                    }
                    Integer value = random.nextInt(100);
                    queue.offer(value);
                    System.out.println("Produced value: " + value);
                    lock.notify();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void consume(){
        while(true){
            try {
                Thread.sleep(2000);
                synchronized(lock){
                    if(queue.size() == 0){
                        lock.wait();
                    }
                    Integer value = queue.poll();
                    System.out.println("Consumed value: " + value);
                    lock.notify();
                }
            } catch (InterruptedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
        
        }
    }
}
