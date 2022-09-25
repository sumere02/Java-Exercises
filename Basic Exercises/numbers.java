import java.util.Scanner;

public class numbers{
    public static void main(String[] args) {
        double a;
        double b;
        double c; 
        double max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numbers: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        if (a >= b && a >= c){
            max = a;
        }
        else if (b >= c){
            max = b;
        }
        else{
            max = c;
        }
        System.out.println("Maximum Number: " + max);
        scanner.close();
    }
}