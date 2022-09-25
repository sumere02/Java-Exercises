import java.util.Scanner;

public class Main{
    static Scanner scanner = new Scanner(System.in);
    
    public static void ageCheck(int age){
        if(age < 18){
            throw new InvalidAgeException("Age Restriction");
        }
        else{
            System.out.println("Welcome to SumerPub");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            ageCheck(age);

        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Goodbye");
        }
    }
}