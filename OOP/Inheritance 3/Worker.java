public class Worker {
    private String name;
    private String surname;
    private int id;
    
    
    public Worker(String name,String surname,int id){
        this.name = name;
        this.surname = surname;
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void show_information(){
        System.out.println("Worker Information");
        System.out.println("******************");
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Id: " + this.id);
        
    }
}
