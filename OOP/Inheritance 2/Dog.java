public class Dog extends Animal{
    private int teeth_num;
    public Dog(String name,int weight,int height,int leg_number,int teeth_num){
        super(name,weight,height,leg_number);
        this.teeth_num = teeth_num;
    }
    //Override
    public void move(int speed){
        System.out.println("Speed Of Dog: " + speed);
    }
    public void run(int speed){
        System.out.println("Dog is running right now");
        //You can use without super.()
        super.move(speed);
    }  
}
