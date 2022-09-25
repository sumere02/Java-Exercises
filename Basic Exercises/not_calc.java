import java.util.Scanner;

public class not_calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();
        System.out.println("Enter Midterm 1-Midterm 2-Final: ");
        double mt1 = scanner.nextDouble();
        double mt2 = scanner.nextDouble();
        double fin = scanner.nextDouble();
        double average = mt1*3/10.0 + mt2*3/10.0 + fin*4/10.0;
        if (average >= 90){
            System.out.println("Letter Grade: AA");
        }
        else if(average >= 85){
            System.out.println("Letter Grade: BA");
        }
        else if(average >= 80){
            System.out.println("Letter Grade: BB");
        }
        else if(average >= 75){
            System.out.println("Letter Grade: CB");
        }
        else if(average >= 70){
            System.out.println("Letter Grade: CC");
        }
        else if(average >= 65){
            System.out.println("Letter Grade: DC");
        }
        else if(average >= 60){
            System.out.println("Letter Grade: DD");
            if (gpa < 2.50){
                System.out.println("Your GPA is low you may want to think retake the lesson");
            }
        }
        else{
            System.out.println("Letter Grade: FF");
        }
        System.out.println(gpa);
        scanner.close();
    }
}
