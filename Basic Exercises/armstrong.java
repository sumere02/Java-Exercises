import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************");
        System.out.println("Armstrong Numbers");
        System.out.println("*****************");
        System.out.println("Exit:-1");
        int number = 0;
        do{
            int total = 0;
            System.out.print("Number: ");
            number = scanner.nextInt();
            int temp = number;
            while(temp > 0){
                total += Math.pow((temp % 10),String.valueOf(number).length());
                temp /= 10;
            }
            if (total == number){
                System.out.println(number + " is an Armstrong Number");
            }
            else{
                System.out.println(number + " is not an Armstrong Number");
            }
        }while(number >= 0);   
        scanner.close();
    
    }
}