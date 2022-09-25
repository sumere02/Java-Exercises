public class Meng implements IEngineer, IWork {
    private boolean soldier;
    private boolean record;
    
    @Override
    public void work() {
        System.out.println("Meng is working");
        
    }

    public Meng(boolean soldier,boolean record){
        this.soldier = soldier;
        this.record = record;
    }
    
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
        if(array.length == 0){
            System.out.println("I don't have a working experince");
        }
        else{
            System.out.print("I worked ");
            for(String s:array){
                System.out.print(s + " ");
            }
            System.out.println("as Machine Engineer");
        }
        
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
    
    public void reference_get(String[] array){
        if(array.length == 0){
            System.out.println("I don't have a reference");
        }
        else{
            System.out.print("References: ");
            for(String s:array){
                System.out.print(s +" ");
            }
            System.out.println();
        }
    }
    
}
