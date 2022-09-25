public class SoftwareDev extends Worker {

    private String languages;

    public SoftwareDev(String name,String surname,int id,String languages){
        super(name,surname,id);
        this.languages = languages;
    }

    public void format_pc(String operating_system){
        System.out.println(getName() + " is formatting your system to" + operating_system);
    }

    //Override
    public void show_information(){
        super.show_information();
        System.out.println("Languages: " + languages);
    }
}
