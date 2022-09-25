import java.util.Scanner;

public class Atm {
    public void power(Account account){
        Double amount;
        Login login = new Login();
        Scanner scanner_new = new Scanner(System.in);
        System.out.println("********************");
        System.out.println("Welcome To SumerBank");
        System.out.println("********************");
        int hearth = 3;
        while(hearth > 0){
            Boolean flag = login.login(account);
            if(flag){
                System.out.println("Welcome");
                break;
            }
            System.out.println("Incorrect ID or Password, Try Again");
            hearth -= 1;
        }
        if(hearth == 0){
            System.out.println("System Locked");
        }
        else{
            System.out.println("*************************");
            System.out.println("1. Account Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("Q. Exit");
            System.out.println("*************************");
            while(true){
                System.out.print("Operation: ");
                char operation = scanner_new.next().charAt(0);
                switch(operation){
                    case '1':
                        System.out.println("Balance: " + account.getCash());
                        break;
                    case '2':
                    System.out.print("Amount: ");
                        amount = scanner_new.nextDouble();
                        account.deposit(amount);
                        break;
                    case '3':
                        System.out.print("Amount: ");
                        amount = scanner_new.nextDouble();
                        account.withdraw(amount);
                        break;
                    case 'Q':
                        return;
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }
            }
        }
        scanner_new.close();
    }
}
