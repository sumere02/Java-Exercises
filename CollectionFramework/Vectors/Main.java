package Vectors;

import java.util.Vector;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Java");
        vector.add("Python");
        for(String s : vector){
            System.out.println(s);
        }
        System.out.println("**************");
        //System.out.println(vector.lastElement());
        //System.out.println(vector.firstElement());
        Stack<String> stack = new Stack();
        //stack.add("Python");
        stack.push("Python");
        stack.push("Java");
        stack.push("Go");
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        //System.out.println(stack.peek());
        for(String s: stack){
            System.out.println(s);
        }
        System.out.println("*************************");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }


    }
}
