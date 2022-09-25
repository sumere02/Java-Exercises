//Inheritance
//subclass 
public class Manager extends worker {
    
    private int labor_number;

    //Constructor
    public Manager(String name,int wage,String department,int labor_number){
        super(name,wage,department);
        this.labor_number = labor_number;
    }

    public void show_information(){
        super.show_information(); // Also you can use getters and setters
        System.out.println("Labor: " + labor_number);
    }

    public void raise_wage(int amount){
        System.out.println(amount + " Raise is added to wages");
    }

}
