package thread1;

public class Printer extends Thread{
    private String name;

    public Printer(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name + " working.");
        for(int i = 1;i<= 10;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);    
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
            
        }
        System.out.println(this.name + " succesfully finished his work");
    }
    

}
