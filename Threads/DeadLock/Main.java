public class Main{
    public static void main(String[] args) {
        SampleDeadlock deadlock = new SampleDeadlock();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                deadlock.thread1Func();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                deadlock.thread2Func();
            }
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        deadlock.threadOver();
    }
}