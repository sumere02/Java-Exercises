package LetterFreq;

import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main{
    static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        Map<Character,Integer> frequency = new TreeMap<Character,Integer>();
        for(int i = 0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            if(frequency.containsKey(c)){
                frequency.replace(c,frequency.get(c) + 1);
            }
            else{
                frequency.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry : frequency.entrySet()){
            System.out.println("Character: " + entry.getKey() + " appears " + entry.getValue() + " times");
        }    
    }
}