public class Main{
    public static void main(String[] args) {
        ListWorker workers = new ListWorker();
        /*
        long start = System.currentTimeMillis();
        workers.valueAssign();
        long end = System.currentTimeMillis();
        System.out.println("Time Consumed: " + (end-start));
        */
        workers.work();
    }
}