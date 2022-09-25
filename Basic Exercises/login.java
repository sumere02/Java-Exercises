import java.util.Scanner;
public class login {
    public static void main(String[] args) {
        String info = "**********************\n" +
                      "Welcome\n" +
                      "**********************";
        System.out.println(info);
        Scanner scanner = new Scanner(System.in);
        String id = "sumere20";
        String password = "Exiled98";
        int hearth = 3;
        while(hearth > 0){
            System.out.print("ID: ");
            String entered_id = scanner.nextLine();
            System.out.print("Password: ");
            String entered_password = scanner.nextLine();
            if (id.equals(entered_id) && password.equals(entered_password)){
                System.out.println("Welcome, " + id);
                break;
            }
            System.out.println("Invalid ID or Password, Please Try Again");
            hearth -= 1;
        }
        if (hearth == 0){
            System.out.println("System locked");
        }
        scanner.close();
    }
}
