import java.util.Scanner;

public class interest_rate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Welcome To SumerBank");
        System.out.println("********************");
        System.out.println("Interest Rate: %6");
        double interest = 0.06;
        System.out.print("Amount: ");
        Double amount = scanner.nextDouble();
        System.out.print("No Of Year: ");
        int year = scanner.nextInt();
        for(int i = 1;i <= year;i++){
            amount += amount*interest;
            System.out.println("Year: " + i + " Cash: " + amount);
        }
        scanner.close();
    }
}
