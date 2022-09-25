import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        
            try(FileWriter writer = new FileWriter("file.txt");
                FileWriter writer_2 = new FileWriter("file_2.txt")
            ){
                writer.write("Deneme");
                writer_2.write("Deneme 2");
            }
            catch(IOException e){
                System.out.println("Error when file is opening");
            }
        /*
        try(FileWriter writer = new FileWriter("file.txt")){
            writer.write("Deneme");
        }
        catch(IOException e){
            System.out.println("Error when file is opening");
        }
        */
    }
}