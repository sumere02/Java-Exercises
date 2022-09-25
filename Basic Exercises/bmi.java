import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Height-Weight(in m - in kg): ");
        double height = scanner.nextDouble();
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
        scanner.close();
    }   
}
