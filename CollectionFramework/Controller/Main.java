package Controller;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] channels = {"TRT","ATV","FOX","TGRT","NTV","ASPOR","VOLE"};
        Controller controller = new Controller(channels);
        String name = null;
        Iterator<String> __iter__ = controller.iterator();
        while(true){
            System.out.println("LG TV");
            System.out.println("******************");
            System.out.println("1.Show Channels");
            System.out.println("2.Add Channel");
            System.out.println("3.Remove Channel");
            System.out.println("4.Number Of Channel");
            System.out.println("5.Next Channel");
            System.out.println("6.Power Off");
            System.out.println("******************");
            System.out.print("Operation: ");
            int op = scanner.nextInt();
            scanner.nextLine();
            switch(op){
                case 1:
                    for(String channel : controller){
                        System.out.println(channel);
                    }
                    break;
                case 2:
                    System.out.print("Channel Name: ");
                    name = scanner.nextLine();
                    controller.addChannel(name);
                    break;
                case 3:
                    System.out.print("Channel Name: ");
                    name = scanner.nextLine();
                    controller.removeChannel(name);
                    break;
                case 4:
                    System.out.println(controller.channelNumber());
                    break;
                case 5:
                    String value = __iter__.hasNext() ? __iter__.next():"Last Channel";
                    System.out.println(value);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
    
}
