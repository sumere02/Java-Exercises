package thread2;

public class Main {
    public static void main(String[] args) {
        Thread pt_1 = new Thread(new Printer("Printer 1"));
        Thread pt_2 = new Thread(new Printer("Printer 2"));
        pt_1.start();
        pt_2.start();
        System.out.println("Main thread is working");
    }
}
