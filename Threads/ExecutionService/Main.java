import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args) {
        /*
        Thread t1 = new Thread(new Worker("Emir",15));
        Thread t2 = new Thread(new Worker("Furkan",25));
        Thread t3 = new Thread(new Worker("Recep",1));
        Thread t4 = new Thread(new Worker("Melek", 3));
        Thread t5 = new Thread(new Worker("Mustafa Murat Coskun",5));
        System.out.println("Subthreads started");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        System.out.println("Returned to Main Thread");
    */

    ExecutorService executor = Executors.newFixedThreadPool(2);
    for(int i = 0;i<=5;i++){
        executor.submit(new Worker(String.valueOf(i),i));
    }
    executor.shutdown();
    System.out.println("All processes are done");
    }
}