public class Threadsafe{
    private int count = 0;

    public synchronized void add(){
        count++;
    }
    public void startThreads(){
        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0;i<5000;i++){
                    add();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0;i<5000;i++){
                    add();
                }
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        Threadsafe threadsafe = new Threadsafe();
        threadsafe.startThreads();
    }
}