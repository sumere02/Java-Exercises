package StackPalindrome;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();
        Stack<Character> stack = new Stack<Character>();
        boolean flag = true;
        for(int i = 0;i<(int)sentence.length()/2;i++){
            stack.push(sentence.charAt(i));
        }
        int i = (int)sentence.length()/2;
        if(sentence.length() % 2 == 1){
            i += 1;
        }
        for(;i<sentence.length();i++){
            if(stack.pop() != sentence.charAt(i)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }    
}
