import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void print_op(){
        System.out.println("*******************");
        System.out.println("0 - Show Operations");
        System.out.println("1 - Next City");
        System.out.println("2 - Previous City");
        System.out.println("3 - Exit");
        System.out.println("*******************");
    }

    public static void travel_cities(LinkedList<String> cities){
        ListIterator<String> __iter__ = cities.listIterator();
        int op;
        print_op();
        Scanner scanner = new Scanner(System.in);
        if(!__iter__.hasNext()){
            System.out.println("City Not Found");
        }
        boolean exit = false;
        boolean prev_flag = false;
        boolean next_flag = false;
        while(!exit){
            System.out.print("Operation: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch(op){
                case 0:
                    print_op();
                    break;
                case 1:
                    if(prev_flag){
                        __iter__.next();
                    }
                    prev_flag = false;
                    if(__iter__.hasNext()){
                        next_flag = true;
                        System.out.println("Loading...");
                        System.out.println("City: " + __iter__.next());
                    }
                    else{
                        System.out.println("Last City");
                    }
                    break;
                case 2:
                    if(next_flag){
                        __iter__.previous();
                    }
                    next_flag = false;
                    if(__iter__.hasPrevious()){
                        System.out.println("Loading...");
                        System.out.println("City: " + __iter__.previous());
                        prev_flag = true;
                        
                    }
                    else{
                        System.out.println("First City");
                    }
                    break;
                case 3:
                    System.out.println("Good Day");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid Opearation");
                    break;

            }
        }
        scanner.close();
    }


    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<String>();
        cities.add("Ankara");
        cities.add("Eskisehir");
        cities.add("Afyon");
        travel_cities(cities);
    }
    
}
