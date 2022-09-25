import java.util.Scanner;

public class basic_calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Operation: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Number 1: ");
        double num_1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num_2 = scanner.nextDouble();
        double result = 0;
        Boolean flag = true;
        if (operation == '+'){
            result = num_1 + num_2;
        }
        else if(operation == '-'){
            result = num_1 - num_2;
        }
        else if(operation == '*'){
            result = num_1 * num_2;
        }
        else if(operation == '/'){
            result = num_1 / num_2;
        }
        else if(operation == '%'){
            result = num_1 % num_2; 
        }
        else{
            flag = false;
            System.out.println("Invalid Operation");
        }
        if (flag){
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}