public class Main{
    public static void main(String[] args) {
        SampleReentrantLock re = new SampleReentrantLock();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                re.thread1func();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                re.thread2func();
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
        re.threadOver();
    }
}