import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        while(true){
            System.out.println("Math|Physics Problems");
            System.out.println("************************");
            System.out.println("1.Calculate Circle Area");
            System.out.println("2.Calculate Triangle Area");
            System.out.println("3.Calculate Dot Product");
            System.out.println("Q.Exit");
            System.out.println("************************"); 
            System.out.print("Operation: ");
            char op = scanner.nextLine().charAt(0);
            switch(op){
                case 'Q':
                    System.out.println("Shutting Down");
                    return;
                case '1':
                    System.out.print("Radius: ");
                    int radius = scanner.nextInt();
                    scanner.nextLine();
                    Problem.Mathematic.circleArea(radius);
                    break;
                case '2':
                    System.out.print("Side Lengths(a,b,c): ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    Problem.Mathematic.perimeterTriangle(a, b, c);
                    break;
                case '3':
                    Vec vec_1 = new Vec("A");
                    Vec vec_2 = new Vec("B");
                    Problem.Physics.dotProduct(vec_1,vec_2);
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }     
        }
    }
}