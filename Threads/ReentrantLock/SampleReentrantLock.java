import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.Scanner;

public class SampleReentrantLock {
    
    private int count = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void add(){
        for(int i = 0;i<10000;i++){
            count++;
        }
    }
        
    public void thread1func(){
        lock.lock();
        System.out.println("Thread 1 is waiting");
        try {
            condition.await();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread 1 is running");
        try {
            add();    
        }
        finally{
            lock.unlock();
        } 
    }

    public void thread2func(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread 2 is working");
        try{
            add();
            System.out.print("Press a button: ");
            scanner.nextLine();
            condition.signal();
            System.out.println("Thread 1 is powered by Thread 2");
        }
        finally{
            lock.unlock();
            scanner.close();
        }
        
    }

    public void threadOver(){
        System.out.println("Value Of Count: " + count);
    };
}
