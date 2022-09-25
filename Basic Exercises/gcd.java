import java.util.Scanner;

public class gcd {
    public static int gcd_calculator(int a,int b){
        int gcd = 0;
        
        for(int i = 1;i<=a && i<=b;i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("GCD Calculator");
        System.out.println("***************");
        while(true){
        System.out.print("Numbers(a,b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.nextLine();
        int value = gcd_calculator(a,b);
        System.out.println("GCD: " + value);
        char c;
        do{
        System.out.print("Continue : Y - EXIT : Q: ");
        c = scanner.next().charAt(0);
        }while( c != 'Q' && c  != 'Y');
        if (c == 'Q'){
            System.out.println("Exiting...");
            break;
        }
        }
        scanner.close();
    }    
}
