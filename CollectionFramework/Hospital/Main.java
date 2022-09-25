package Hospital;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Patient> queue = new PriorityQueue<Patient>();
        queue.offer(new Patient("Murat","Burn"));
        queue.offer(new Patient("Okan","Headache"));
        queue.offer(new Patient("Elif","Appendicitis"));
        queue.offer(new Patient("Oguz","Burn"));
        queue.offer(new Patient("Merve","Burn"));
        queue.offer(new Patient("Gizem","Appendicitis"));
        /*
        while(!queue.isEmpty()){
            System.out.println("Name: " + queue.peek().getName() + " Type: " + queue.poll().getType());
        }
        */
        while(!queue.isEmpty()){
            System.out.println("**********************");
            System.out.println(queue.poll());
            System.out.println("**********************");
        }
    }    
}
