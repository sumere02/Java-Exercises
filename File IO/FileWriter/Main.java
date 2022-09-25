import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("file.txt");
            writer.write("Emir Sumer\n");
            writer.write("Furkan Sumer\n");
            writer.write("Recep Sumer\n");
        } catch (IOException e) {
            System.out.println("Error when file is opening");
        }
        finally{
            if(writer != null){
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Error when file is closing");
                }
            }
        }
    }
}