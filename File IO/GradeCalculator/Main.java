import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;

public class Main{
    public static String gradeCalc(int m1,int m2,int f){
        double average = m1*3.0/10.0 + m2*3.0/10.0 + f*4.0/10.0;
        String grade = null;
        if (average >= 90){
            grade = "AA";
        }
        else if(average >= 85){
            grade = "BA";
        }
        else if(average >= 80){
            grade = "BB";
        }
        else if(average >= 75){
            grade = "CB";
        }
        else if(average >= 70){
            grade = "CC";
        }
        else if(average >= 65){
            grade = "DC";
        }
        else if(average >= 60){
            grade = "DD";
        }
        else{
            grade = "FF";
        }
        return grade;
    }
    public static void main(String[] args) {
        String[] line = null;
        
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("students.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter("newgrades.txt"))
            ){
            while(scanner.hasNextLine()){
                line = scanner.nextLine().split(",");
                //writer.write("Name: " + line[0] + " Letter Grade: " +gradeCalc(Integer.parseInt(line[1]),Integer.parseInt(line[2]),Integer.parseInt(line[3])) + "\n");
                writer.write(line[0] + "\n");
            } 
        } catch (IOException e) {
            System.out.println("Error when opening file");
        }
    }
}