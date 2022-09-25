package Controller;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller implements Iterable<String>{
    private ArrayList<String> channels = new ArrayList<String>();

    public Controller(String[] channels){
        for(String channel : channels){
            this.channels.add(channel);
        }
    }

    public void addChannel(String channel){
        this.channels.add(channel);
    }

    public void removeChannel(String channel){
        if(this.channels.contains(channel)){
            this.channels.remove(channel);
        }
        else{
            System.out.println("Channel does not exists");
        }
    }

    public int channelNumber(){
        return this.channels.size();
    }

    public ArrayList<String> getChannels() {
        return channels;
    }

    public void setChannels(ArrayList<String> channels) {
        this.channels = channels;
    }

    public class ContollerIterator implements Iterator<String>{
        private int index = 0;
        
     
        @Override
        public boolean hasNext() {
            if(index < channels.size()){
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String value = channels.get(index);
            index++;
            return value;
        }

        @Override
        public void remove() {
            // TODO Auto-generated method stub
            Iterator.super.remove();
        }
        
    }

    @Override
    public Iterator<String> iterator() {
        //return this.channels.iterator();
        return new ContollerIterator();
    }
    
}
