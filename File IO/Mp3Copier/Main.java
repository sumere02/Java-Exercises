import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.File;
import java.util.ArrayList;


public class Main{
    private static ArrayList<Integer> information = new ArrayList<Integer>();

    public static void readFile(){
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("mars.mp3");
            int read;
            try {
                while((read = fis.read()) != -1){
                    information.add(read);
                }
            } catch (IOException e) {
                System.out.println("Error when reading the file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        }
        finally{
            try {
                if(fis != null){
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println("Error when closing the file");
            }
        }
    }

    public static void writeFile(String fileName){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            try {
                for(int value : information){
                    fos.write(value);
                }
            } catch (IOException e) {
                System.out.println("Error when writing the file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
        }
        finally{
            try {
                if(fos != null){
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error when closing the file");
            }
        }
    }
    public static void main(String[] args) {
        readFile();
        writeFile("copied.txt");
    }
}