import java.util.Scanner;
import java.lang.Thread;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println("Welcome to Sabiha Gökçen Airport");
            System.out.println("********************************");
            System.out.println("Abroad Departue Requirements");
            System.out.println("1.Visa");
            System.out.println("2.Mortar");
            System.out.println("3.No Political Restriction");
            System.out.println("*******************************");
            System.out.print("Mortar: ");
            boolean visa = false;
            boolean political_restriction = false;
            int mortar = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Do you have a visa (Yes Or No): ");
            String result = scanner.nextLine();
            if(result.equals("Yes")){
                visa = true; 
            }
            System.out.print("Do you have a political restriction(Yes or No): ");
            result = scanner.nextLine();
            if(result.equals("Yes")){
                political_restriction = true;
            }
            Passenger passenger = new Passenger(mortar,political_restriction,visa);
            try{
                System.out.println("Mortar requirement is checking");
                Thread.sleep(3000);
                passenger.abroadMortar();
                System.out.println("Political restriction requirement is checking");
                Thread.sleep(3000);
                passenger.politicalRestriction();
                System.out.println("Visa requirement is checking");
                Thread.sleep(3000);
                passenger.visaStatus();
                System.out.println("Process is finished, You can go abroad");
                break;
            }
            catch(Exception e){
                e.printStackTrace();
                continue;
            }
        }
        scanner.close();
    }
    
}