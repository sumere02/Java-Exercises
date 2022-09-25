import java.io.Serializable;

public class Student implements Serializable{
    private static final long serialVersionUID = 2000;
    private String name;
    private int id;
    private String field;
    public Student(String name, int id, String field) {
        this.name = name;
        this.id = id;
        this.field = field;
    }
    @Override
    public String toString() {
        return "Student: " + this.name + " ID: " + this.id + " Field: " + this.field;
    }

    
}