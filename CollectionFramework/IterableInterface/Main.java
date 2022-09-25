package IterableInterface;

public class Main {
    public static void main(String[] args) {
        String[] channels = {"Radio Viva","Radio Fenomen","Pop King"};
        Radio radio = new Radio(channels);
        for(String channel : radio){
            System.out.println(channel);
        }
    }
}
