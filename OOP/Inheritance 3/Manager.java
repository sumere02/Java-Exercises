public class Manager extends Worker {
    private int responsible_number;

    public Manager(String name,String surname,int id,int responsible_number){
        super(name,surname,id);
        this.responsible_number = responsible_number;
    }

    //Override
    public void show_information(){
        super.show_information();
        System.out.println("Responsible worker number: " + this.responsible_number);
    }

    public void raise(int amount){
        System.out.println("A raise of " + amount +  " was given to " + getName());
    }

}
