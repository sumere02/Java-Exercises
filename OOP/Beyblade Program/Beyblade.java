public class Beyblade {
    private String person_name;
    private int speed;
    private int power;

    public Beyblade(String person_name, int speed, int power) {
        this.person_name = person_name;
        this.speed = speed;
        this.power = power;
    }
    public String getPerson_name() {
        return person_name;
    }
    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println(person_name + " attacks with speed " + this.speed + " and power " + this.power);
    }

    public void monster_power(){
        System.out.println("This beyblade does not exists monster");
    }

    public void show_information(){
        System.out.println("Name: " + this.person_name);
        System.out.println("Speed: " + this.speed);
        System.out.println("Power: " + this.power);
    }
}
