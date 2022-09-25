import java.util.Scanner;

public class Main{
    public static void printMenu(){
        System.out.println("Area Calculator");
        System.out.println("***************");
        System.out.println("0.Operations");
        System.out.println("1.Triangle");
        System.out.println("2.Square");
        System.out.println("3.Circle");
        System.out.println("4.Exit");
        System.out.println("***************");
    }
    public static void main(String[] args) {
        //Can not create from abstract class
        //Shape shape = new Shape("Shape");
        //Square square_1 = new Square("Square",3);
        //Circle circle_1 = new Circle("Circle 1",3);
        //square_1.calculateArea();
        //circle_1.calculateArea();
        Scanner scanner = new Scanner(System.in);
        Shape object = null;
        printMenu();
        int op;
        while(true){
            System.out.print("Operation: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op){
                case 0:
                    printMenu();
                    break;
                case 1:
                    System.out.print("Side Lengths(a,b,c): ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    object = new Triangle("Triangle",a,b,c);
                    object.calculateArea();
                    break;
                case 2:
                    System.out.print("Side Length: ");
                    int side = scanner.nextInt();
                    scanner.nextLine();
                    object = new Square("Square",side);
                    object.calculateArea();
                    break;
                case 3:
                    System.out.print("Radius: ");
                    double radius = scanner.nextDouble();
                    object = new Circle("Circle",radius);
                    object.calculateArea();
                    break;
                case 4:
                    System.out.println("Good Day");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid Operation");
                    break;

            }

        }
    }
}