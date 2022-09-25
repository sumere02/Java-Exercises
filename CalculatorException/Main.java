import java.util.Scanner;

public class Main{
    static class insufficentMemory extends Exception{

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
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
                if(num_1 > 10000 || num_2 > 10000){
                    throw new insufficentMemory();
                }
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
        }
        catch(insufficentMemory e){
            System.out.println("Error: Insufficient Memory");
        }
        catch(Exception e){
            System.out.println("Error: Invalid Format");
        }
        finally{
            scanner.close();
        }
    }
}