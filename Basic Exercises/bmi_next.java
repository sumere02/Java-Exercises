import java.util.Scanner;

public class bmi_next {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height (in m): ");
        double height = scanner.nextDouble();
        System.out.print("Weight (in kg): ");
        double weight = scanner.nextDouble();
        double bmi = weight /(height* height);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5){
            System.out.println("Thin");
        }
        else if(bmi < 25){
            System.out.println("Normal");
        }
        else if(bmi < 30){
            System.out.println("Overweighted");
        }
        else{
            System.out.println("Obezite");
        }
        scanner.close();
    }
}
