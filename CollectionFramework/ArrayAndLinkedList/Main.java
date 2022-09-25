package ArrayAndLinkedList;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list_1 = new LinkedList<Integer>();
        ArrayList<Integer> list_2 = new ArrayList<Integer>();
        calculateTime("LinkedList",list_1);
        calculateTime("ArrayList",list_2);
    }
    public static void calculateTime(String datatype,List<Integer> list){
        //Adding value to list
        long start;
        long finish;

        start = System.currentTimeMillis();
        for(int i = 0;i<100000;i++){
            list.add(0,i);
        }
        finish = System.currentTimeMillis();
        System.out.println("List Type: " + datatype);
        System.out.println("Time: " + (finish-start));
    }

}
