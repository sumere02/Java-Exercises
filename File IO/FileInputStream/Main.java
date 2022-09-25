import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("file.txt");
            try {
                /*
                fis.skip(5);
                System.out.println((char)fis.read());    
                */
                while(true){
                    int value = (int)fis.read();
                    if(value == -1){
                        break;
                    }
                    else{
                        System.out.print((char)value);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error when reading the file");
            }
            
        }
        catch(FileNotFoundException e){
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
}