package IterableInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class Radio implements Iterable<String>{
    private ArrayList<String> channels = new ArrayList<String>();

    public Radio(String[] channels){
        for(String channel : channels){
            this.channels.add(channel);
        }
    }

    public class RadioIterator implements Iterator<String> {
        private int index = 0; 
        
        @Override
        public boolean hasNext() {
            if(index < channels.size()) {
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
        
    }



    @Override
    public Iterator<String> iterator() {
        //return this.channels.iterator();
        return new RadioIterator();
    }   
    

}
