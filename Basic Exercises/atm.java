import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SumerBank");
        System.out.println("*********************");
        System.out.println("Operations:\n1. Current Money\n2. Withdraw Money\n3. Deposit Money\nExit:Q");
        System.out.println("*********************");
        double cash = 0.0;
        do{
            System.out.print("Operation: ");
            char operation = scanner.next().charAt(0);
            if (operation == '1'){
                System.out.println("Current: " + cash);
            }
            else if(operation == '2'){
                System.out.print("Amount: ");
                double amount = scanner.nextDouble();
                if(amount <= cash){
                    cash -= amount;
                }
                else{
                    System.out.println("Insufficent Amount");
                }
            }
            else if(operation == '3'){
                System.out.print("Amount: ");
                double amount = scanner.nextDouble();
                cash += amount;
            }
            else if(operation == 'Q'){
                System.out.println("Please Take Your Card");
                break;
            }
            else{
                System.out.println("Invalid Operation");
            }

        }while(true);


        scanner.close();
    }
}
