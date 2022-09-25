package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
       HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
       hashMap.put(10,"Java");
       hashMap.put(30,"Python");
       hashMap.put(50,"PHP");
       hashMap.put(20,"PHP");
       hashMap.put(10,"Emir");
       //System.out.println(hashMap);
       //System.out.println(hashMap.get(10));
       //First change hasmap to set then use for each loop
       for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " ----> " + "Value: " + entry.getValue());
       }
    }
}