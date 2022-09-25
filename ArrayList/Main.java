import java.util.Scanner;
public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);    
    public static void print_operations(){
        System.out.println("Operations");
        System.out.println("*******************");
        System.out.println("0 - Show Operations");
        System.out.println("1 - Show Singers");
        System.out.println("2 - Add Singer");
        System.out.println("3 - Update Singer");
        System.out.println("4 - Delete Singer");
        System.out.println("5 - Search Singer");
        System.out.println("6 - Exit");
        System.out.println("*******************");
    }

    public static void show(){
        singers.print_singers();
    }

    public static void add_singer(){
        System.out.print("Singer name: ");
        String name = scanner.nextLine();
        singers.addSinger(name);
    }

    public static void update_singer(){
        System.out.print("New name of singer: ");
        String newname = scanner.nextLine();
        System.out.print("Position of singer: ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        singers.updateSinger(newname, pos-1);
    }

    public static void delete_singer(){
        System.out.print("Position of singer: ");
        int pos = scanner.nextInt();
        singers.deleteSinger(pos-1);
    }

    public static void search_singer(){
        System.out.print("Singer name: ");
        String name = scanner.nextLine();
        singers.searchSinger(name);
    }




    public static void main(String[] args) {
        System.out.println("\tSinger Application");
        print_operations();
        boolean exit = false;
        int op;
        while(!exit){
            System.out.print("Operation: ");
            op = scanner.nextInt();
            scanner.nextLine();
            switch (op){
                case 0:
                    print_operations();
                    break;
                case 1:
                    show();
                    break;
                case 2:
                    add_singer();
                    break;
                case 3:
                    update_singer();
                    break;
                case 4:
                    delete_singer();
                    break;
                case 5:
                    search_singer();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                System.out.println("Invalid Operation");


            }
        }
    }   
}
