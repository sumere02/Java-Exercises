package HashMapLinkedHashMapTreeMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Collection;

public class Main {

    public static void printMap(Map<Integer,String> map){
        map.put(10,"C++");
        map.put(5,"Python");
        map.put(1,"Java");
        map.put(2,"PHP");
        map.put(100,"C");
        /*
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        */
        /*
        for(Integer key : map.keySet()){
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }
        */
        Collection<String> values = map.values();
        for(String s:values){
            System.out.println(s);
        }
        
    }
    public static void main(String[] args) {
        Map<Integer,String> hashmap = new HashMap<Integer,String>();   // Random order
        Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>(); // Entried Order
        Map<Integer,String> treemap = new TreeMap<Integer,String>(); // Orders with index values
        printMap(hashmap);
        System.out.println("************************");
        printMap(linkedhashmap);
        System.out.println("************************");
        printMap(treemap);
    }
}
