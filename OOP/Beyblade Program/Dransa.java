public class Dransa extends Beyblade {
    private String monster;

    public Dransa(String person_name, int speed, int power, String monster) {
        super(person_name, speed, power);
        this.monster = monster;
    }
    
    public void show_information(){
        super.show_information();
        System.out.println("Monster: " + this.monster);
    }

    public void monster_power(){
        System.out.println(getPerson_name() + " " + " extracted his monster");
        System.out.println(getPerson_name() + "'s attack is" + " Fire Sword");
    }

}
