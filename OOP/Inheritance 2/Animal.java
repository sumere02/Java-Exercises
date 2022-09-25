public class Animal{
    
    private String name;
    private int weight;
    private int height;
    private int leg_number;

    public Animal(String name,int weight,int height,int leg_number){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.leg_number = leg_number;

    }

    public void eat(){
        System.out.println("Animal is eating right now");
    }

    public void move(int speed){
        System.out.println("Speed Of Animal: " + speed);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return this.height;
    }
    public void setLegNumber(int leg_number){
        this.leg_number = leg_number;
    }
    public int getLegNumber(){
        return this.leg_number;
    }
    
    
}