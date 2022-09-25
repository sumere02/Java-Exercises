import java.util.concurrent.Semaphore;

public class SampleSemaphore {
    //permits = Thread number
    private Semaphore sem = new Semaphore(3);

    public void threadFunc(int id){
        try {
            sem.acquire();
            System.out.println("Thread is starting... ID: " + id);
            Thread.sleep(5000);
            System.out.println("Thread is exiting... ID: " + id);
            sem.release();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
