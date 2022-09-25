package PriorityQueue;

public class Player implements Comparable<Player> {
    private String name;
    private int id;
    public Player(String name, int id) {
        this.name = name;
        this.id = id;
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
    @Override
    public int compareTo(Player p) {
        if(this.id < p.id){
            return -1;
        }
        else if(this.id == p.id){
            return 0;
        }
        return 1;
    }
}
