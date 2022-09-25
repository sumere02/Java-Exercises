import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your program: ");
        System.out.print("Push Up - Sit Up - Squat Numbers: ");
        int pushup = scanner.nextInt();
        int situp = scanner.nextInt();
        int squat = scanner.nextInt();
        scanner.nextLine();
        FitnessProgram workout = new FitnessProgram(pushup,situp,squat);
        System.out.println("**************");
        System.out.println("Push Up");
        System.out.println("Sit Up");
        System.out.println("Squat");
        System.out.println("Q. Exit");
        System.out.println("**************");
        while(true){
            System.out.print("Which move do you want to do: ");
            String movement_name = scanner.nextLine();
            System.out.print("How many times do you want to do: ");
            int number = scanner.nextInt();
            workout.doMovement(movement_name, number);
            System.out.print("Continue: Y - Exit: Q: ");
            char c = scanner.next().charAt(0);
            while(c != 'Y' && c != 'Q'){
                System.out.println("Invalid Operator");
                System.out.print("Continue: Y - Exit: Q: ");
                c = scanner.next().charAt(0);
            }
            scanner.nextLine();
            if( c == 'Q'){
                if(workout.workoutend()){
                    System.out.println("You finished your program, Good job");
                }
                else{
                    System.out.println("Remaining Movements: ");
                    System.out.println("Push Up: " + workout.getPushup_number());
                    System.out.println("Sit Up: " + workout.getSitup_number());
                    System.out.println("Squat: " + workout.getSquat_number());
                    
                }
                break;
            }
               
        }
        
        scanner.close();
    }
}
