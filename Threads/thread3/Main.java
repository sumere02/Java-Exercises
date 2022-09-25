package thread3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is working");
        Thread pt_1 = new Thread(new Runnable(){
            public void run(){
                System.out.println("Thread is working");
                for(int i = 1;i<=10;i++){
                    System.out.println("Thread 1: " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread Interrupted");
                    }
                }
            }
        });
        /*
        //One Time Thread
        new Thread(new Runnable(){
        public void run(){
        System.out.println("Thread is working");
        for(int i = 1;i<=10;i++){
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
                }
            }
        });
         */
        pt_1.start();
    }
}
