public class Dragon extends Beyblade {
    private String monster;
    private String secret_power;
    
    public Dragon(String person_name, int speed, int power, String monster, String secret_power) {
        super(person_name, speed, power);
        this.monster = monster;
        this.secret_power = secret_power;
    }

    
    public void monster_power() {
        System.out.println(getPerson_name() + " " + " extracted his monster");
        System.out.println(getPerson_name() + "'s attack is" + " Ghost Hurricane");
    }

   
    public void show_information() { 
        super.show_information();
        System.out.println("Monster: " + this.monster);
        System.out.println("Secret Power: " + this.secret_power);
    }

    

    
}
