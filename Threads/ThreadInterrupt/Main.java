import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread is working...");
                for(int i = 0;i<100000;i++){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Thread interrupted");
                        return;
                    }
                    list.add(i);
                }
                /* 
                for(int i = 1;i<=10;i++){
                    System.out.println("Thread is writing: " + i);
                    try {
                        Thread.sleep(1000);
                        System.out.println("Thread is at " + i + " second of it's sleep");
                    } catch (InterruptedException e) {
                        //TODO: handle exception
                        System.out.println("Thread's sleep is interrupted");
                    }
                }
                */
                System.out.println("Thread accomplished operation without interrupted");
            }
        });
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t1.interrupt();
    }
}