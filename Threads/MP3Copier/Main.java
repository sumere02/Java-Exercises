import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main{
    static List<Integer> information = new ArrayList<Integer>();
    
    public static void readFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("mars.mp3");
            int read;
            while((read = fis.read()) != -1){
                information.add(read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    public static void writeFile(String fileName){
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for(int s: information){
                fos.write(s);
            }   
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        readFile();
        /*
        //10 Sn
        ThreadFactory t1 = new ThreadFactory("c1.mp3");
        ThreadFactory t2 = new ThreadFactory("c2.mp3");
        ThreadFactory t3 = new ThreadFactory("c3.mp3");
        long start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (end-start));
        */
        //24 Sn
        long start = System.currentTimeMillis();
        writeFile("c1.mp3"); 
        writeFile("c2.mp3"); 
        writeFile("c3.mp3");
        long end = System.currentTimeMillis();
        System.out.println("Elapsed Time: " + (end-start)); 
        
    }
}