import java.util.Scanner;

public class Mathematic{
    private double PI = Math.PI;

    public class Factoriel{
        public void Fact(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            int total = 1;
            for(int i = 2;i<=num;i++){
                total *= i;
            }
            System.out.println(num + "! = " + total);
            scanner.close();
        }
    }

    public class Prime{
        public boolean checkPrime(int number){
            boolean flag = true;
            for(int i=2;i<number;i++){
                if(number % i == 0){
                    flag = false;
                    break;
                }
            }
            return flag;            

        }
    }
    public class Area{ 
        public class CircleArea{
            public void circle_area(int radius){
                System.out.println("Area Of Circle: " + radius*radius*PI);
            }
        }
    }
}