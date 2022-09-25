import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Beyblade Program");
        System.out.println("***************************");
        System.out.println("Q : Exit");
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Which beyblade do you prefer: ");
            String value = scanner.nextLine();
            if(value.equals("Q")){
                System.out.println("Shutting Down");
                break;
            }
            else{
                BeybladeFactory factory = new BeybladeFactory();
                Beyblade beyblade = factory.CreateBeyblade(value);
                if(beyblade == null){
                    System.out.println("Invalid Beyblade");
                }
                else{
                    beyblade.show_information();
                    beyblade.attack();
                    beyblade.monster_power();
                }
                  
            }
        }
        scanner.close();
    }
}
