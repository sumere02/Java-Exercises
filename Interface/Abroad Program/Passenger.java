public class Passenger implements AbroadRules {
    private int mortar;
    private boolean political_restriction;
    private boolean visa_status;
    
    public Passenger(int mortar,boolean political_restriction, boolean visa_status){
        this.mortar = mortar;
        this.political_restriction = political_restriction;
        this.visa_status = visa_status;
    }

    @Override
    public boolean abroadMortar() {
        boolean flag = false;
        if(this.mortar < 15){
            System.out.println("Defficient amount");
        }
        else{
            System.out.println("Operation completed succesfully");
            flag = true;
        }
        return flag;

    }
    @Override
    public boolean politicalRestriction() {
        boolean flag = false;
        if(this.political_restriction == true){
            System.out.println("You do have a political restriction you can't go abroad");
        }
        else{
            System.out.println("Operation completed succesfully");
            flag = true;
        }
        return flag;
    }
    @Override
    public boolean visaStatus() {
        boolean flag = false;
        if(this.visa_status){
            System.out.println("Visa operations completed");
            flag = true;
        }
        else{
            System.out.println("You don't have a visa");
        }
        return flag;
    }

    
}
