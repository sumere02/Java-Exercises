public class Ceng implements IEngineer {

    private boolean soldier;
    private boolean record;

    public Ceng(boolean soldier,boolean record){
        this.soldier = soldier;
        this.record = record;
    }
    //Signing Forms
    @Override
    public void check_record() {
        if(record){
            System.out.println("I do have a record");
        }
        else{
            System.out.println("I don't have a record");
        }
        
    }

    @Override
    public void experience(String[] array) {
        System.out.print("I worked ");
        for(String s:array){
            System.out.print(s + " ");
        }
        System.out.println("As Computer Engineer");
    }

    @Override
    public String gpa(Double degree) {
        
        return "GPA: " + degree;
    }

    @Override
    public void soldier_state() {
        if(soldier){
            System.out.println("I completed my military service");
        }
        else{
            System.out.println("I did not complete my military service yet");
        }
        
    } 
}
