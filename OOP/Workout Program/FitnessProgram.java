public class FitnessProgram{
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public FitnessProgram(int pushup_number,int situp_number,int squat_number){
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squat_number = squat_number;
    }

    public void setPushup_number(int pushup_number){
        this.pushup_number = pushup_number;
    }
    public int getPushup_number(){
        return this.pushup_number;
    }
    public void setSitup_number(int situp_number){
        this.situp_number = situp_number;
    }
    public int getSitup_number(){
        return this.situp_number;
    }
    public void setSquat_number(int squat_number){
        this.squat_number = squat_number;
    }
    public int getSquat_number(){
        return this.squat_number;
    }
    public void doPushup(int number){
        if(pushup_number == 0){
            System.out.println("Movement Finished");
        }
        else if(pushup_number > number){
            pushup_number -= number;
            System.out.println("Remaining Push Ups: " + pushup_number);
        }
        else{
            pushup_number = 0;
            System.out.println("Remaining Push Ups: " + pushup_number);
            System.out.println("You did extra pushups");
        }
    }
    public void doSitup(int number){
        if(situp_number == 0){
            System.out.println("Movement Finished");
        }
        else if(situp_number > number){
            situp_number -= number;
            System.out.println("Remaining Sit Ups: " + situp_number);
        }
        else{
            situp_number = 0;
            System.out.println("Remaining Sit Ups: " + situp_number);
            System.out.println("You did extra Sit Ups");
        }
    }
    public void doSquat(int number){
        if(squat_number == 0){
            System.out.println("Movement Finished");
        }
        else if(squat_number > number){
            squat_number -= number;
            System.out.println("Remaining Squat: " + squat_number);
        }
        else{
            squat_number = 0;
            System.out.println("Remaining Squat: " + squat_number);
            System.out.println("You did extra Squats");
        }
    }
    
    
    
    public void doMovement(String type,int number){
        if(type.equals("Push Up")){
            doPushup(number);
        }
        else if(type.equals("Sit Up")){
            doSitup(number);
        }
        else if(type.equals("Squat")){
            doSquat(number);
        }
        else{
            System.out.println("Invalid Movement Type");
        }
    }
    public boolean workoutend(){
        return (squat_number == 0 && situp_number == 0 && pushup_number == 0);
    }

}