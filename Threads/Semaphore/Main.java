public class Main{
    public static void main(String[] args) {
        SampleSemaphore semaphore = new SampleSemaphore();

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                semaphore.threadFunc(1);
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                semaphore.threadFunc(2);
            }
        });
        
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                semaphore.threadFunc(3);
            }
        });

        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                semaphore.threadFunc(4);
            }
        });
        
        Thread t5 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                semaphore.threadFunc(5);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }


    }
}