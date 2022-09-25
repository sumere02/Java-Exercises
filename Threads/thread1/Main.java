package thread1;

public class Main {
    public static void main(String[] args) {
        Printer pt_1 = new Printer("Printer 1");
        Printer pt_2 = new Printer("Printer 2");
        pt_1.start();
        pt_2.start();
        System.out.println("Main thread is working");
    }
}
