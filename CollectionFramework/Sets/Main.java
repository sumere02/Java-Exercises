package Sets;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*
        Set<String> set_1 = new HashSet<String>();
        Set<String> set_2 = new LinkedHashSet<String>();
        Set<String> set_3 = new TreeSet<String>();
        Set<String> set_4 = new HashSet<String>();
        //HashSet
        set_1.add("Java");
        set_1.add("Python");
        set_1.add("C++");
        set_1.add("Javascript");
        set_1.add("PHP");
        //LinkedHashSet
        set_2.add("Java");
        set_2.add("Python");
        set_2.add("C++");
        set_2.add("Javascript");
        set_2.add("PHP");
        //TreeSet
        set_3.add("Java");
        set_3.add("Python");
        set_3.add("C++");
        set_3.add("Javascript");
        set_3.add("PHP");
        set_1.remove("Java");
        System.out.println();
        System.out.println("HashSet");
        System.out.println("********************************");
        for(String s:set_1){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("LinkedHashSet");
        System.out.println("********************************");
        for(String s:set_2){
            System.out.println(s);
        }
        System.out.println();
        System.out.println("TreeSet");
        System.out.println("********************************");
        for(String s:set_3){
            System.out.println(s);
        }
        System.out.println("********************************");
        System.out.println(set_1.contains("Java"));
        System.out.println(set_1.contains("Emir"));
        System.out.println(set_1.isEmpty());
        System.out.println(set_4.isEmpty());
        */
        Set<String> set_1 = new HashSet<String>();
        Set<String> set_2 = new HashSet<String>();
        set_1.add("Java");
        set_1.add("C");
        set_1.add("Python");
        set_1.add("HTML");
        set_1.add("SQL");

        set_2.add("C");
        set_2.add("HTML");
        set_2.add("CSS");

        Set<String> difference = new HashSet<String>(set_2);
        System.out.println(difference.removeAll(set_1));
        System.out.println(difference);
        Set<String> intersection = new HashSet<String>(set_2);
        System.out.println(intersection.retainAll(set_1));
        System.out.println(intersection);
    }
}
