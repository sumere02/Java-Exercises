import java.util.Scanner;

public class fuel {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fuel Per KM: ");
        double per_km_fuel = scanner.nextDouble();
        System.out.print("Cost Per Liter: ");
        double liter = scanner.nextDouble();
        System.out.print("KM: ");
        double km = scanner.nextDouble();
        double fuel = per_km_fuel * km;
        System.out.println("Total Fuel: " + fuel);
        System.out.println("Total Cost: " + fuel*liter);
        scanner.close();
        
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a);
        System.out.println(b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
        scanner.close();
        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sides of triangle: ");
        double side_1 = scanner.nextDouble();
        double side_2 = scanner.nextDouble();
        double hypothenus = Math.sqrt(side_1 * side_1  + side_2 * side_2);
        System.out.println("Hypothenus: " + hypothenus);
        scanner.close();
        */
    }
}
