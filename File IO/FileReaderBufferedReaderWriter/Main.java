import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) {
        String line = null;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("students.txt")))){
            System.out.println("*******************");
            while(scanner.hasNextLine()){
                line = scanner.nextLine();
                String[] array = line.split(",");
                if(array[1].equals(" Computer Engineering"))
                System.out.println(line);
            }
            System.out.println("*******************");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        } 
        catch (IOException e) {
            System.out.println("Error when opening file");
        }



    }
}