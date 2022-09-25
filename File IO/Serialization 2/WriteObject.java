import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObject {
    
    public static void main(String[] args) {
        Student st_1 = new Student("Emir Sumer",1019,"Ceng");
        Student st_2 = new Student("Furkan Sumer",1050,"Law");
        Student st_3 = new Student("Recep Sumer",1040,"Business");
        Student[] student_array = {st_1,st_2,st_3};
        ArrayList<Student> student_list = new ArrayList<Student>(Arrays.asList(student_array));
        
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("students.bin"))){
            output.writeObject(student_array);
            output.writeObject(student_list);

        } catch (IOException e) {
            System.out.println("Error when writing the file");
        }
        
    }
}
