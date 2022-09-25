public class MotherBoard {
    private String model;
    private String producer;
    private int slot_number;
    private String os;

    public MotherBoard(String model,String producer,int slot_number,String os){
        this.model = model;
        this.producer = producer;
        this.slot_number = slot_number;
        this.os = os;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return this.model;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }
    public String getProducer(){
        return this.producer;
    }
    public void setSlot(int slot_number){
        this.slot_number = slot_number;
    }
    public int getSlot(){
        return this.slot_number;
    }
    public void setOs(String os){
        this.os = os;
    }
    public String getOs(){
        return this.os;
    }

    public void install_os(String os){
        this.os = os;
        System.out.println(this.os + " Operating system succesfully installed");
    }
    
}
