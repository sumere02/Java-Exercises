package Hospital;

public class Patient implements Comparable<Patient> {
    private String name;
    private String type;
    private int id = 0;
    public Patient(String name, String type) {
        this.name = name;
        this.type = type;
        if(this.type == "Appendicitis"){
            this.id = 1;
        }
        else if(this.type == "Burn"){
            this.id = 2;
        }
        else{
            this.id = 3;
        }

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public int compareTo(Patient o) {
        if(this.id < o.id){
            return -1;
        }
        else if(this.id == o.id){
            return 0;
        }
        return 1;
    }
    @Override
    public String toString() {
        return "Patient Name: " + this.name + "\nDisease Type: " + this.type;
    }
        
   
    
    
    
}
