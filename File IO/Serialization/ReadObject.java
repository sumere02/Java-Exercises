import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("student.bin"))){
            try {
                Student st_1 = (Student)(input.readObject());  
                Student st_2 = (Student)(input.readObject());
                System.out.println("**********************");
                System.out.println("Student 1");
                System.out.println("**********************");
                System.out.println(st_1);
                System.out.println("**********************\n");
                System.out.println("**********************");
                System.out.println("Student 2");
                System.out.println("**********************");
                System.out.println(st_2);
                System.out.println("**********************");
                
                
            } catch (ClassNotFoundException e) {
                System.out.println("Error occurred when converting object");
            }
            
        } catch (IOException e) {
            System.out.println("Error occurred when reading file");
        }    
    }
}
