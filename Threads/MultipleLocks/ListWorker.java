import java.util.Random;
import java.util.ArrayList;

public class ListWorker {
    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    
    public void list1Add(){
        synchronized(lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }
    }

    public void list2Add(){
        synchronized(lock2){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }

    public void valueAssign(){
         for (int i = 0; i < 1000; i++) {
            list1Add();
            list2Add();            
         }
    }

    public void work(){
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                valueAssign();
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                valueAssign();
            }
        });
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("List 1 Size: " + list1.size() + "\nList 2 Size: " + list2.size());
        System.out.println("Elapsed Time: " + (end-start));
    }
}
