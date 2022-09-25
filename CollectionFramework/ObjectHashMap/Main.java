package ObjectHashMap;

import java.util.Set;
import java.util.HashSet;

class Player{
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
    


}

public class Main {
    public static void main(String[] args) {
        Set<Player> hashSet = new HashSet<Player>();
        Player player_1 = new Player("Emir",10);
        Player player_2 = new Player("Furkan", 15);
        Player player_3 = new Player("Recep",20);
        Player player_4 = new Player("Emir", 10);

        hashSet.add(player_1);
        hashSet.add(player_2);
        hashSet.add(player_3);
        hashSet.add(player_4);

        for(Player p : hashSet){
            System.out.println(p);
        }
        
        

    }
}
