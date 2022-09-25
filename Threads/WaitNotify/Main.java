public class Main{
    public static void main(String[] args) {
        WaitNotify wn = new WaitNotify();

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                wn.thread1Func();
            }
        });

        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                // TODO Auto-generated method stub
                wn.thread2Func();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
    }
}