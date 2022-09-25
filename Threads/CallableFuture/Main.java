import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Random random = new Random();
        /*
        executor.submit(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    System.out.println("Thread is working");
                    Thread.sleep(random.nextInt(1000) + 2000);
                    System.out.println("Thread is exiting");            
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
                
            }
        });
        */
        //Future<?>
        Future<Integer> value = executor.submit(new Callable<Integer>(){

            @Override
            public Integer call() throws Exception {
                // TODO Auto-generated method stub
                int time = random.nextInt(1000) + 2000;
                if(time > 2500){
                    throw new IOException("Thread is powered of too much");
                }
                try {
                    System.out.println("Thread is working");
                    Thread.sleep(time);
                    System.out.println("Thread is exiting");            
                } catch (InterruptedException e) {
                    //TODO: handle exception
                    e.printStackTrace();
                }
                return time;
            }
            
        });
        executor.shutdown();
        try {
            System.out.println("Returned Value: " + value.get());
        } catch (InterruptedException | ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}