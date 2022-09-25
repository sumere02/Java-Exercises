import java.util.Scanner;

public class Login {
    public Boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        //scanner.close();
        if(account.getUser().equals(id) && account.getPassword().equals(password)){
            return true;
        }
        return false;
    }    
}
