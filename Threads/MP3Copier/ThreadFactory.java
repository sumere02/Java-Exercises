public class ThreadFactory extends Thread{
    private String fileName;

    public ThreadFactory(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void run() {
        Main.writeFile(fileName);
    }   
}
