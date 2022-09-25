package QueueInterface;

import java.util.Queue;
import java.util.LinkedList;
//Stack LIFO
//Queue FIFO

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("PHP");
        queue.offer("C++");
        //System.out.println(queue.peek());
        for(String s:queue){
            System.out.println(s);
        }
        System.out.println("************************");
        System.out.println("Removing value: " + queue.poll());
        System.out.println("Removing value: " + queue.poll());
        System.out.println("************************");
        for(String s:queue){
            System.out.println(s);
        }
        System.out.println("*************************");
        while(!queue.isEmpty()){
            System.out.println("Removing value: " + queue.poll());
        }
        
    }
}
