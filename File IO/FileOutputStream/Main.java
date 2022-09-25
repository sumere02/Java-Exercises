import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("file.txt");
        try{
            fos = new FileOutputStream(file);
            try{
                String s = "Emir Sumer";
                byte[] s_array = s.getBytes();
                //byte[] array = {101,75,66,68};
                fos.write(s_array);

            }
            catch(IOException e){
                System.out.println("Error when writing the file");
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File does not exists");
        }
        finally{
            try{
                fos.close();
            }
            catch(IOException e){
                System.out.println("Error when closing the file");
            }
        }
    }
}