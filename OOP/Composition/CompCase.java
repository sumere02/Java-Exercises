public class CompCase {
    private String model;
    private String producer;
    private String material;
    
    //Shortcut with Source Action
    public CompCase(String model, String producer, String material) {
        this.model = model;
        this.producer = producer;
        this.material = material;
    }

    

    public String getModel() {
        return model;
    }



    public void setModel(String model) {
        this.model = model;
    }



    public String getProducer() {
        return producer;
    }



    public void setProducer(String producer) {
        this.producer = producer;
    }



    public String getMaterial() {
        return material;
    }



    public void setMaterial(String material) {
        this.material = material;
    }



    public void open_pc(){
        System.out.println("Welcome");
    }

    
    
}
