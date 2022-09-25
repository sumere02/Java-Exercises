package RamadanQueue;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Random;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.print("Number of breads: ");
        //int num = scanner.nextInt();
        //scanner.nextLine();
        Random random = new Random();
        int num = 1 + random.nextInt(10);
        System.out.println(num + " bread is produced");
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Murat");
        queue.offer("Hasan");
        queue.offer("Okan");
        queue.offer("Ayse");
        queue.offer("Merve");
        queue.offer("Ezgi");
        queue.offer("Gizem");
        queue.offer("Mehmet");
        queue.offer("Oguz");
        queue.offer("Azer");
        for(int i = 0;i<num;i++){
            System.out.println("Bread taken: " + queue.poll());
        }

    }
}
