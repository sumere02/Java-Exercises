import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mathematic.Factoriel fact = new Mathematic().new Factoriel();
        Mathematic.Prime prime = new Mathematic().new Prime();
        //Mathematic.Area area = new Mathematic().new CircleArea();
        Mathematic.Area.CircleArea area = new Mathematic().new Area().new CircleArea();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if(prime.checkPrime(number)){
           System.out.println("Prime number"); 
        }
        else{
            System.out.println("Not a prime number");
        }
        fact.Fact();
        area.circle_area(5);
        scanner.close();

    }
}
