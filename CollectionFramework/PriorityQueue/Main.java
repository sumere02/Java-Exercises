package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        Queue<Player> queue = new PriorityQueue<Player>();
        Player p_1 = new Player("Emir",1);
        Player p_2 = new Player("Recep",4);
        Player p_3 = new Player("Melek",2);
        Player p_4 = new Player("Mustafa",15);
        Player p_5 = new Player("Furkan",3);
        queue.offer(p_1);
        queue.offer(p_2);
        queue.offer(p_3);
        queue.offer(p_4);
        queue.offer(p_5);
        while(!queue.isEmpty()){
            System.out.println(queue.poll().getName());
        }

        
    }
}
