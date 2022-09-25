import java.util.Scanner;

public class Main{

    /*
        //Use throws for checked exceptions
        public static void checkAge(int age) throws IOException{
            if(age < 18){
                throw new IOException();
        }
    }
     */
    public static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException();
        }
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        try{
            checkAge(age);
            System.out.println("Welcome, SumerPub");
        }
        catch(Exception e){
            System.out.println("Age restriction");
        }
        finally{
            System.out.println("Goodbye");
        }
    }
}