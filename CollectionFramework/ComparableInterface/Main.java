package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ReversedString implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
    
}

class Player implements Comparable<Player>{
    private String name;
    private int id;
    
    public Player(String name,int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Name: " + name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Player player) {
        //Sort
        if(this.id < player.id){
            return -1;
        }
        else if(this.id == player.id){
            return 0;
        }
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    

}

class ReversedPlayer implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return -o1.compareTo(o2);
    }
    
}

class StringOrdered implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.getName().length() < o2.getName().length()){
            return -1;
        }
        else if(o1.getName().length() == o2.getName().length()){
            return 0;
        }
        return 1;
    }
    
}

public class Main {
    public static void main(String[] args) {
        /*
        List<String> array = new ArrayList<String>();
        array.add("Java");
        array.add("Python");
        array.add("C++");
        array.add("Go");
        //Collections.sort(array);
        Collections.sort(array,new ReversedString());
        for(String s : array){
            System.out.println(s);
        }
        */
        
        List<Player> playerList = new ArrayList<Player>();  
        playerList.add(new Player("Emir",4));
        playerList.add(new Player("Furkan",3));
        playerList.add(new Player("Recep",1));
        playerList.add(new Player("Melek",2));
        //Collections.sort(playerList);
        //Collections.sort(playerList,new ReversedPlayer());
        Collections.sort(playerList,new StringOrdered());
        for(Player p : playerList){
            System.out.println(p);
        }
        
        
    }
}
