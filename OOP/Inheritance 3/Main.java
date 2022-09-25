import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Worker Program");
        System.out.println("**************************");
        System.out.println("1. Software Dev Operations");
        System.out.println("2. Manager Operations");
        System.out.println("Q. Exit");
        System.out.println("**************************");
        while(true){
            System.out.print("Operation: ");
            String operation = scanner.nextLine();
            if(operation.equals("Q")){
                System.out.println("Shutting Down");
                break;
            }
            else if(operation.equals("1")){
                SoftwareDev dev_1 = new SoftwareDev("Emir", "Sümer", 112,"C, C++, Python, Java");
                while(true){
                    System.out.println("Software Dev Panel");
                    System.out.println("*******************");
                    System.out.println("1. Format PC");
                    System.out.println("2. Show Information");
                    System.out.println("Q. Exit");
                    System.out.println("*******************");
                    System.out.print("Operation: ");
                    String dev_operation = scanner.nextLine();
                    if(dev_operation.equals("Q")){
                        System.out.println("Good Day");
                        break;
                    }
                    else if(dev_operation.equals("1")){
                        System.out.print("Operating System: ");
                        String system = scanner.nextLine();
                        dev_1.format_pc(system);
                    }
                    else if(dev_operation.equals("2")){
                        dev_1.show_information();
                    }
                    else{
                        System.out.println("Invalid Operation");
                    }

                }
            }
            else if(operation.equals("2")){
                Manager manager_1 = new Manager("Recep","Sümer",1019,200);
                while(true){
                    System.out.println("Manager Panel");
                    System.out.println("********************");
                    System.out.println("1. Raise Wage");
                    System.out.println("2. Show Information");
                    System.out.println("Q. Exit");
                    System.out.println("********************");
                    System.out.print("Operation: ");
                    String manager_operation = scanner.nextLine();
                    if(manager_operation.equals("Q")){
                        System.out.println("Good Day");
                        break;
                    }
                    else if(manager_operation.equals("1")){
                        System.out.print("Amount: ");
                        int amount = scanner.nextInt();
                        scanner.nextLine();
                        manager_1.raise(amount);
                    }
                    else if(manager_operation.equals("2")){
                        manager_1.show_information();
                    }
                    else{

                    }
                }

            }
            else{
                System.out.println("Invalid Operation");
            }
        }
        scanner.close();
    }
}