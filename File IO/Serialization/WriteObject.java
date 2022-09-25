import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteObject {
    public static void main(String[] args) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.bin"))){
            Student st_1 = new Student("Emir Sumer",1019,"Ceng");
            Student st_2 = new Student("Furkan Sumer",1071,"Law");
            output.writeObject(st_1);
            output.writeObject(st_2);
        } catch (IOException e) {
            System.out.println("Error when writing the file");
        }
        
    }
}
