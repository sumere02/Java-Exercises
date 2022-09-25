package LıstIteratorVSIterator;

import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        
        /*
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");
        */
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        /*
        Iterator<String> set__iter__ = set.iterator();
        Iterator<String> list__iter__ = list.iterator();
        */
        ListIterator<String> __iter__ = list.listIterator();
        /*
        while(set__iter__.hasNext()){
            System.out.println(set__iter__.next());
        }
        System.out.println("*********************");
        while(list__iter__.hasNext()){
            System.out.println(list__iter__.next());
        }
        */
        while(__iter__.hasNext()){
            System.out.println(__iter__.next());
        }
        while(__iter__.hasPrevious()){
            System.out.println(__iter__.previous());
        }

    }
}
