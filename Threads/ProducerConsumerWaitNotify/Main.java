public class Main{
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                pc.produce();
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                pc.consume();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            //TODO: handle exception
        }
    }
}