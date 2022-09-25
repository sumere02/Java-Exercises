import java.util.Scanner;

public class WaitNotify {
    private Object lock = new Object();
    public void thread1Func(){
        synchronized(lock){
            System.out.println("Thread 1 is working");
            System.out.println("Thread 1 is waiting for Thread 2 to wake him up");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                //TODO: handle exception
            }
            System.out.println("Thread 1 is woke up");
        }
    }

    public void thread2Func(){
        Scanner scanner = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        synchronized(lock){
            System.out.println("Thread 2 is working");
            System.out.print("Press button to continue: ");
            scanner.nextLine();
            lock.notify();
            System.out.println("Thread 1 woken up by thread 2");
            
        }
        scanner.close();
    }
}
