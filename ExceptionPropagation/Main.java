public class Main{
    static void thirdFunc(){
        int a = 30/0;
        System.out.println(a);
    }
    static void secondFunc(){
        thirdFunc();
        System.out.println("abc");
    }
    static void firstFunc(){
        secondFunc();
    }
    
    public static void main(String[] args) {
        try{
            firstFunc();
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero");
        }
    }
}