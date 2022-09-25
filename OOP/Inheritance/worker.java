
//super class or base class
public class worker{
    private String name;
    private int wage;
    private String department;
    
    //Constructor
    public worker(String name,int wage,String department){
        this.name = name;
        this.wage = wage;
        this.department = department;
    }
    public void work(){
        System.out.println("Worker is working...");
    }

    public void show_information(){
        System.out.println("Name: " + this.name);
        System.out.println("Wage: " + this.wage);
        System.out.println("Departmen: " + this.department);
    }

    public void change_department(String new_department){
        System.out.println("Departmen is changing");
        this.department = new_department;

        System.out.println("New Department: " + this.department);
    }

}