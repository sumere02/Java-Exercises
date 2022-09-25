//import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Character[] char_array = {'J','A','V','A'};
        Integer[] int_array = {1,2,3,4,5};
        String[] str_array = {"JAVA","PYTHON","C++"};
        Student[] student_array = {new Student("Emir"),new Student("Furkan"),new Student("Recep")};
        Print<Character> printChar = new Print<Character>();
        Print<Integer> printInt = new Print<Integer>();
        Print<String> printString = new Print<String>();
        Print<Student> printStudent = new Print<Student>();
        //ArrayList<Character> new_array = new ArrayList<Character>();
        printChar.print(char_array);
        System.out.println("************************");
        printInt.print(int_array);
        System.out.println("************************");
        printString.print(str_array);
        System.out.println("************************");
        printStudent.print(student_array);
    }   
}