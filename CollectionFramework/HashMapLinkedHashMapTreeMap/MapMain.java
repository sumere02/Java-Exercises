package HashMapLinkedHashMapTreeMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
//import java.util.Collection;

public class MapMain {

    public static void printMap(Map<Integer,String> map){
        map.put(10,"C++");
        map.put(5,"Java");
        map.put(1,"Python");
        map.put(2,"PHP");
        map.put(100,"C");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
        //System.out.println(map.keySet());
        //Collection<String> values = map.values();
    }
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();
        Map<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        System.out.println("**********************");
        printMap(hashMap);
        System.out.println("**********************");
        printMap(linkedHashMap);
        System.out.println("**********************");
        printMap(treeMap);
        System.out.println("**********************");
        
    }
}
