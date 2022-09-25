import java.util.Scanner;

public class prime_numbers {
    
    public static Boolean prime_calculator(int number){
        Boolean flag = true;
        for(int i = 2;i<number;i++){
            if (number % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("Prime Number Calculator");
        System.out.println("***********************");
        System.out.print("Upper Limit: ");
        int limit = scanner.nextInt();
        System.out.println("2 is a prime number.");
        for(int i = 3;i<=limit;i++){
            Boolean prime_flag = prime_calculator(i);
            if(prime_flag){
                System.out.println(i + " is a prime number.");
            }
        }

        scanner.close();
    }
}
