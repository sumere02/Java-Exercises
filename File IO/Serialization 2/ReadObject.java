import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("students.bin"))){
            Student[] student_array = (Student[])input.readObject();
            ArrayList<Student> student_list = (ArrayList<Student>)input.readObject();
            System.out.println("-------------------");
            for(Student st : student_array){
                System.out.println(st);
                System.out.println("-------------------");
            }
            System.out.println("\n-------------------");
            for(Student st : student_list){
                System.out.println(st);
                System.out.println("-------------------");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error occurred when converting object");
        } catch (IOException e) {
            System.out.println("Error occurred when reading file");
        }    
    }
}
